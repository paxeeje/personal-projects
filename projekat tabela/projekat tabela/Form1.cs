using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace projekat_tabela
{
    public partial class Form1 : Form
    {
        bool redosled = true;
        public static int brdodatnog;
        public static string[] klubniz = new string[16];
        public static int[] bodniz = new int[16];
        public static int[] golniz = new int[16];
        public static int[] utakmiceniz = new int[16];
        public static int brklubova;
        public static TextBox[] klubboxniz = new TextBox[16];
        public static TextBox[] golboxniz = new TextBox[16];
        public static TextBox[] bodboxniz = new TextBox[16];
        public static TextBox[] mestoboxniz = new TextBox[16];
        public static TextBox[] utakmiceboxniz = new TextBox[16];
        public static int[]mestoniz=new int[16];
        TextBox prosek = new TextBox();
        TextBox najmanjagol = new TextBox();
        TextBox najvecagol = new TextBox();
        public static double balans;
       

        public Form1()
        {
            InitializeComponent();
        }
        
        public void button1_Click(object sender, EventArgs e)
        {
            StreamReader l = new StreamReader("Balans.txt");
            balans = Convert.ToDouble((l.ReadLine()));
            
            TextBox balansbox = new TextBox();
            balansbox.Location = new Point(545,25);
            balansbox.Text = balans.ToString();
            balansbox.Width = 95;
            balansbox.BackColor = Color.Green;
            balansbox.ForeColor = Color.White;
            this.Controls.Add(balansbox);
            l.Close();  
            for (int g = 0; g < 16; g++)
            {
                mestoniz[g] = g+1;
            }

            StreamReader sr = new StreamReader("tabela.txt");
            brklubova = int.Parse(sr.ReadLine());
            string linija;

            TextBox ime = new TextBox();
            ime.Location = new Point(24, 4);
            ime.Text = "Ime kluba ";
            ime.Width = 250;
            ime.BackColor = Color.Cyan;
            this.Controls.Add(ime);
            TextBox bodovilabel = new TextBox();
            bodovilabel.Location = new Point(24+ime.Width, 4);
            bodovilabel.Text = "bodovi";
            bodovilabel.Width = 80;
            bodovilabel.BackColor = Color.Cyan;
            this.Controls.Add(bodovilabel);
            TextBox golrazlika = new TextBox();
            golrazlika.Location = new Point(24+ime.Width+bodovilabel.Width, 4);
            golrazlika.Text = "Gol razlika";
            golrazlika.Width = 60;
            golrazlika.BackColor = Color.Cyan;
            this.Controls.Add(golrazlika);
            TextBox utakmiceLABEL = new TextBox();
            utakmiceLABEL.Location = new Point(24 + ime.Width + bodovilabel.Width+golrazlika.Width, 4);
            utakmiceLABEL.Text = "Odigrano";
            utakmiceLABEL.Width = 50;
            utakmiceLABEL.BackColor = Color.Cyan;
            this.Controls.Add(utakmiceLABEL);


            int i = 0;
            while (i < brklubova)
            {
                linija = sr.ReadLine();
                string klub = linija.Split(',')[0];
                string bodovi = linija.Split(',')[1];
                string golovi = linija.Split(',')[2];
                string utakmice = linija.Split(',')[3];
                string mesto = mestoniz[i].ToString();

                TextBox klubbox = new TextBox();
                klubbox.Location = new Point(24, 24 + 20 * i);
                klubbox.Text = klub;
                klubbox.Width = 250;
                klubniz[i] = klub;
                klubboxniz[i] = klubbox;
                TextBox bodbox = new TextBox();
                bodbox.Location = new Point(24 + klubbox.Width, 24 + 20 * i);
                bodbox.Text = bodovi;
                bodbox.Width = 80;
                bodniz[i] = Convert.ToInt32(bodovi);
                bodboxniz[i] = bodbox;
                TextBox golbox = new TextBox();
                golbox.Location = new Point(24 + klubbox.Width + bodbox.Width, 24 + 20 * i);
                golbox.Text = golovi;
                golbox.Width = 60;
                golniz[i] = Convert.ToInt32(golovi);
                golboxniz[i] = golbox;
                TextBox mestobox = new TextBox();
                mestobox.Width = 22;
                mestobox.Location = new Point(24 - mestobox.Width, 24 + 20 * i);
                mestobox.Text = mesto;
                mestoboxniz[i] =mestobox;
                TextBox utakmicebox = new TextBox();
                utakmicebox.Width = 50;
                utakmicebox.Location = new Point(24 + klubbox.Width + bodbox.Width+golbox.Width, 24 + 20 * i);
                utakmicebox.Text = utakmice;
                utakmiceboxniz[i] = utakmicebox;
                utakmiceniz[i] = Convert.ToInt32(utakmice);


                if (i==0) mestobox.BackColor = Color.Green;
                if (i == 1) mestobox.BackColor = Color.LightGreen;
                if (i == 2) mestobox.BackColor = Color.Orange;
                if(i==brklubova-1) mestobox.BackColor = Color.Red;
                if (i == brklubova - 2) mestobox.BackColor = Color.Red;



                this.Controls.Add(mestobox);
                this.Controls.Add(klubbox);
                this.Controls.Add(bodbox);
                this.Controls.Add(golbox);
                this.Controls.Add(utakmicebox);
                
                i++;
            }
            sr.Close();
        }

        public void button2_Click(object sender, EventArgs e)
        {
            StreamWriter r = new StreamWriter("Balans.txt");
            r.WriteLine(balans);
            r.Close();
            




            StreamWriter sw = new StreamWriter("tabela.txt");
            
            sw.WriteLine(brklubova);
            string linija;
            bool x = false;
            for (int i = 0; i < brklubova; i++)
            {
                klubniz[i] = klubboxniz[i].Text;
                bodniz[i] = int.Parse(bodboxniz[i].Text);
                golniz[i] = int.Parse(golboxniz[i].Text);


                if (klubniz[i]=="" && bodniz[i].ToString() == "" && golniz[i].ToString() == "")
                {
                    x = true;
                    
                }
                if (x == true) continue;
                linija = klubniz[i] + "," + bodniz[i]+ "," + golniz[i];
                sw.WriteLine(linija);
            }

            sw.Close();
        }

        public void button3_Click(object sender, EventArgs e)
        {
            int c = 0;
            for (int x = 0; x < klubboxniz.Length; x++)
            {
                if (klubboxniz[x] != null)
                {
                    c++;
                }
            }
            c++;
            using (Form2 Form2 = new Form2())
            {
                
                Form2.ShowDialog();
            }
            if(Form2.klik==true)
            {
                
                TextBox klubbox = new TextBox();
                klubbox.Location = new Point(24, 24 +20 * brklubova);
                klubbox.Text = Form2.klub;
                klubbox.Width = 250;
                klubniz[brklubova] = Form2.klub;
                klubboxniz[brklubova] = klubbox;
                TextBox bodbox = new TextBox();
                bodbox.Location = new Point(24 + klubbox.Width, 24 + 20 * brklubova);
                bodbox.Text = Form2.bodovi;
                bodbox.Width = 80;
                bodniz[brklubova] = Convert.ToInt32(Form2.bodovi);
                bodboxniz[brklubova] = bodbox;
                TextBox golbox = new TextBox();
                golbox.Location = new Point(24 + klubbox.Width + bodbox.Width, 24 + 20 * brklubova);
                golbox.Text = Form2.golovi;
                golbox.Width = 60;
                golniz[brklubova] = Convert.ToInt32(Form2.golovi);
                golboxniz[brklubova] = golbox;
                TextBox utakmicebox = new TextBox();
                utakmicebox.Width = 50;
                utakmicebox.Location = new Point(24 + klubbox.Width + bodbox.Width + golbox.Width, 24 + 20 * brklubova);
                utakmicebox.Text = Form2.utakmice;
                utakmiceboxniz[brklubova] = utakmicebox;
                utakmiceniz[brklubova] = Convert.ToInt32(Form2.utakmice);
                TextBox mestobox = new TextBox();
                mestobox.Width = 22;
                mestobox.Location = new Point(24 - mestobox.Width, 24 + 20 * brklubova);
                mestobox.Text = (brklubova+1).ToString();
                mestoniz[brklubova] = brklubova+1;
                mestoboxniz[brklubova] = mestobox;
                

                this.Controls.Add(mestobox);
                this.Controls.Add(klubbox);
                this.Controls.Add(bodbox);
                this.Controls.Add(golbox);
                this.Controls.Add(utakmicebox);



                brklubova++;

                for (int i = 0; i < brklubova; i++)
                {
                    mestobox = mestoboxniz[i];
                    mestobox.BackColor = Color.White;
                    if (i == 0) mestobox.BackColor = Color.Green;
                    if (i == 1) mestobox.BackColor = Color.LightGreen;
                    if (i == 2) mestobox.BackColor = Color.Orange;
                    if (i == brklubova - 1) mestobox.BackColor = Color.Red;
                    if (i == brklubova - 2) mestobox.BackColor = Color.Red;

                }
                this.Controls.Remove(prosek);
                this.Controls.Remove(najmanjagol);
                this.Controls.Remove(najvecagol);

            }
        }
        public static void zamenistring(ref string prvi, ref string drugi)
        {
            string temp = prvi;
            prvi = drugi;
            drugi = temp;
        }
        public static void zameni(ref int prvi, ref int drugi)
        {
            int temp = prvi;
            prvi = drugi;
            drugi = temp;
        }

        void sortiraj(int[] bodniz, int[] golniz, string[] klubniz,int[]utakmiceniz , bool opadajuci)
        {

            bool signal;
            int n=klubboxniz.Length;
            int c=0;
            for (int x = 0; x < n; x++)
            {
                if (klubboxniz[x]!=null)
                {
                    c++;
                }
            }
            for (int i = 0; i < c - 1; i++)
            {
                signal = false;
                for (int j = 0; j < c - i - 1; j++)
                {
                    if(bodniz[j]<bodniz[j+1])
                    {
                        
                        zameni(ref bodniz[j], ref bodniz[j + 1]);
                        zamenistring(ref klubniz[j], ref klubniz[j + 1]);
                        zameni(ref golniz[j], ref golniz[j + 1]);
                        zameni(ref utakmiceniz[j], ref utakmiceniz[j + 1]);

                        signal = true;   
                    }
                    else if (bodniz[j] == bodniz[j+1])
                    {
                        if (golniz[j] < golniz[j+1])
                        {
                            zameni(ref bodniz[j], ref bodniz[j + 1]);
                            zamenistring(ref klubniz[j], ref klubniz[j + 1]);
                            zameni(ref golniz[j], ref golniz[j + 1]);
                            zameni(ref utakmiceniz[j], ref utakmiceniz[j + 1]);
                            signal = true;
                        }
                        
                    }

                }
                if (signal == false) break;
            }
            if (opadajuci==false)
            {
                for (int d = 0; d < c/2; d++)
                {
                    zameni(ref bodniz[d], ref bodniz[c-1-d]);
                    zamenistring(ref klubniz[d], ref klubniz[c - 1 - d]);
                    zameni(ref golniz[d], ref golniz[c - 1 - d]);
                    zameni(ref utakmiceniz[d], ref utakmiceniz[c - 1 - d]);

                }


            }

        }



        private void button4_Click(object sender, EventArgs e)
        {
            for (int i = 0; i < brklubova; i++)
            {
                klubniz[i] = klubboxniz[i].Text;
                bodniz[i] = int.Parse(bodboxniz[i].Text);
                golniz[i] = int.Parse(golboxniz[i].Text);
                utakmiceniz[i] = int.Parse(utakmiceboxniz[i].Text);


            }

            if (redosled == true)
            {
                button4.Text = "Tabela opadajuca";
            }
            else
            {
                button4.Text = "Tabela rastuca";
            }

                
            sortiraj(bodniz, golniz, klubniz,utakmiceniz,redosled);


            int m = 0;
            while (klubboxniz[m] != null)
            {
                klubboxniz[m].Text = klubniz[m];
                bodboxniz[m].Text = bodniz[m].ToString();
                golboxniz[m].Text = golniz[m].ToString();
                utakmiceboxniz[m].Text = utakmiceniz[m].ToString();



                m++;

            }
            
            
            redosled = !redosled;

            


        }

        private void button5_Click(object sender, EventArgs e)
        {

            using (Form3 Form3 = new Form3())
            {

                Form3.ShowDialog();
            }
            if (Form3.klik==true)
            {

                int n = brklubova;
                int c = 0;
                for (int x = 0; x < n; x++)
                {
                    if (klubboxniz[x] != null)
                    {
                        c++;
                    }

                }
                
                for (int i = Form3.pozbrisanja; i < c; i++)
                {
                    klubniz[i] = klubniz[i + 1];
                    bodniz[i] = bodniz[i + 1];
                    golniz[i] = golniz[i + 1];
                    utakmiceniz[i] = utakmiceniz[i + 1];


                    klubboxniz[i].Text = klubniz[i];
                    bodboxniz[i].Text = bodniz[i].ToString();
                    golboxniz[i].Text = golniz[i].ToString();
                    utakmiceboxniz[i].Text = utakmiceniz[i].ToString();
                    mestoboxniz[i].Text = mestoniz[i].ToString();


                }
                this.Controls.Remove(klubboxniz[c - 1]);
                this.Controls.Remove(bodboxniz[c - 1]);
                this.Controls.Remove(golboxniz[c - 1]);
                this.Controls.Remove(utakmiceboxniz[c - 1]);
                this.Controls.Remove(mestoboxniz[c - 1]);
                this.Controls.Remove(prosek);
                this.Controls.Remove(najmanjagol);
                this.Controls.Remove(najvecagol);

                brklubova--;

                TextBox mestobox;
                for (int i = 0; i < brklubova; i++)
                {

                    mestobox = mestoboxniz[i];
                    mestobox.BackColor = Color.White;
                    if (i == 0) mestobox.BackColor = Color.Green;
                    if (i == 1) mestobox.BackColor = Color.LightGreen;
                    if (i == 2) mestobox.BackColor = Color.Orange;
                    if (i == brklubova - 1) mestobox.BackColor = Color.Red;
                    if (i == brklubova - 2) mestobox.BackColor = Color.Red;

                }

            }
            
            

        }

        private void button6_Click(object sender, EventArgs e)
        {
            
            prosek.Width = 95;
            prosek.Location = new Point(675,166);

            int n = brklubova;
            int c = 0;
            for (int x = 0; x < n; x++)
            {
                if (klubboxniz[x] != null)
                {
                    c++;
                }

            }
            float sum=0;
            

            for (int i = 0; i <c; i++)
            {
                sum = sum + bodniz[i]; 
            }
            prosek.Text = (sum / c).ToString();


            this.Controls.Add(prosek);
        }

        private void button7_Click(object sender, EventArgs e)
        {
            najmanjagol.Width = 95;
            najmanjagol.Location = new Point(675, 316);

            int n = brklubova;
            int c = 0;
            for (int x = 0; x < n; x++)
            {
                if (klubboxniz[x] != null)
                {
                    c++;
                }

            }
            int min = 1000000;
            int pozmin = 0;
            for (int i = 0; i < c; i++)
            {
                
                if (min > golniz[i])
                {
                    pozmin = i;
                    min = golniz[i];
                }
                

            }
            najmanjagol.Text = klubniz[pozmin];
            this.Controls.Add(najmanjagol);
                
                
              
        }

        private void button8_Click(object sender, EventArgs e)
        {
            najvecagol.Width = 95;
            najvecagol.Location = new Point(675, 416);

            int n = brklubova;
            int c = 0;
            for (int x = 0; x < n; x++)
            {
                if (klubboxniz[x] != null)
                {
                    c++;
                }

            }
            int max = -1000000;
            int pozmax = 0;
            for (int i = 0; i < c; i++)
            {

                if (max < golniz[i])
                {
                    pozmax = i;
                    max = golniz[i];
                }


            }
            najvecagol.Text = klubniz[pozmax];
            this.Controls.Add(najvecagol);
        }

        private void button9_Click(object sender, EventArgs e)
        {
            using (Form4 Form4 = new Form4())
            {

                Form4.ShowDialog();
            }

           
            
        }
    }
}
