using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace projekat_tabela
{
    public partial class Form4 : Form
    {
        bool odredjen1=false;   
        bool odredjen2=false;   
        public static bool klik2;
        public static string domacin;
        public static int pozdomacin;
        public static string gost;
        public static int pozgost;
        public static int rezdom;
        public static int rezgost;
        public Form4()
        {
            InitializeComponent();
            klik2 = false;
            for (int i = 0; i < Form1.brklubova; i++)
            {
                comboBox1.Items.Add(Form1.klubniz[i]);
                comboBox2.Items.Add(Form1.klubniz[i]);
            }
           
            
                
            
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            domacin = comboBox1.SelectedItem.ToString();
            for (int x = 0; x < Form1.brklubova; x++)
            {
                if (domacin == Form1.klubniz[x])
                {
                    pozdomacin = x;

                }
                


            }
            odredjen1 = true;
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            gost = comboBox2.SelectedItem.ToString();
            for (int x = 0; x < Form1.brklubova; x++)
            {
                if (gost == Form1.klubniz[x])
                {
                    pozgost = x;

                }
                


            }
            odredjen2 = true;   
        }
        double ulog;
        private void button3_Click(object sender, EventArgs e)
        {
            if(odredjen2 == true&&odredjen1==true)
            {
                
                TextBox ulogbox=new TextBox();
                ulogbox.Location = new Point(593, 146);

                ulogbox.Width = 62;
                ulogbox.BackColor = Color.Green;
                ulogbox.ForeColor = Color.White;
                
                this.Controls.Add(ulogbox);
                Button igramdom = new Button();
                
                igramdom.Location = new Point(258, 68);

                igramdom.Width = 75;
                igramdom.BackColor = Color.Blue;
                igramdom.ForeColor = Color.White;
                igramdom.Text = (0.75 + (Convert.ToDouble(pozdomacin) * 0.5)).ToString();
                this.Controls.Add(igramdom);

                Button igramx = new Button();
                igramx.Location = new Point(355, 68);

                igramx.Width = 75;
                igramx.BackColor = Color.Green;
                igramx.ForeColor = Color.White;
                igramx.Text = (0.75 + (Convert.ToDouble(pozdomacin) * 0.5)+ 0.75 + (Convert.ToDouble(pozgost) * 0.5)).ToString();
                this.Controls.Add(igramx);

                Button igramgost = new Button();
                igramgost.Location = new Point(452, 68);

                igramgost.Width = 75;
                igramgost.BackColor = Color.Red;
                igramgost.ForeColor = Color.White;
                igramgost.Text = (1.15 + (Convert.ToDouble(pozgost) * 0.5)).ToString();
                this.Controls.Add(igramgost);

                MessageBox.Show("Izaberite kvotu i zapocnite utakmicu");

            }
            else MessageBox.Show("Niste uneli timove");


        }

        private static void generisiutakmicu()
        {
            Random gen = new Random();
            rezdom = gen.Next(0, 6);
            rezgost = gen.Next(0, 6);
           

        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (domacin == gost) MessageBox.Show("Uneli ste dva ista tima");
            else
            {
                int bodovidomacina=Form1.bodniz[pozdomacin];
                int bodovigosta = Form1.bodniz[pozgost];
                int golrazlikadom = Form1.golniz[pozdomacin];
                int golrazlikagost = Form1.golniz[pozgost];
                int odigranedom = Form1.utakmiceniz[pozdomacin];
                int odigranegost = Form1.utakmiceniz[pozgost];

                generisiutakmicu();
                textBox1.Text=rezdom.ToString();    
                textBox2.Text=rezgost.ToString();
                if (rezdom > rezgost) Form1.bodniz[pozdomacin] = bodovidomacina+3;
                else if(rezdom < rezgost) Form1.bodniz[pozgost]=bodovigosta+3;  
                else if(rezdom==rezgost)
                {
                    Form1.bodniz[pozdomacin] = bodovidomacina + 1;
                    Form1.bodniz[pozgost] = bodovigosta + 1;
                }
                Form1.golniz[pozdomacin] = golrazlikadom + rezdom - rezgost;
                Form1.golniz[pozgost] = golrazlikagost + rezgost-rezdom;
                Form1.utakmiceniz[pozdomacin] = odigranedom+1;
                Form1.utakmiceniz[pozgost] = odigranegost+1;

                Form1.bodboxniz[pozdomacin].Text = Form1.bodniz[pozdomacin].ToString();
                Form1.bodboxniz[pozgost].Text = Form1.bodniz[pozgost].ToString();
                Form1.golboxniz[pozdomacin].Text = Form1.golniz[pozdomacin].ToString();
                Form1.golboxniz[pozgost].Text = Form1.golniz[pozgost].ToString();
                Form1.utakmiceboxniz[pozdomacin].Text = Form1.utakmiceniz[pozdomacin].ToString();
                Form1.utakmiceboxniz[pozgost].Text = Form1.utakmiceniz[pozgost].ToString();





            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void igramdom_Click(object sender, EventArgs e)
        {
            if (rezdom > rezgost) Form1.balans = (0.75 + (Convert.ToDouble(pozdomacin) * 0.5)) * ulog;
            else Form1.balans = Form1.balans - ulog;
        }
        private void igramgost_Click(object sender, EventArgs e)
        {
            if (rezdom < rezgost) Form1.balans = (0.75 + (Convert.ToDouble(pozgost) * 0.5)) * ulog;
            else Form1.balans = Form1.balans - ulog;
        }
        private void igramx_Click(object sender, EventArgs e)
        {
            if(rezdom==rezgost) Form1.balans = (0.75 + (Convert.ToDouble(pozdomacin) * 0.5) + 0.75 + (Convert.ToDouble(pozgost) * 0.5)) * ulog;
            else Form1.balans = Form1.balans - ulog;
        }

    }
}
