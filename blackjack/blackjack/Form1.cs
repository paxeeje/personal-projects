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
using System.Threading;

namespace blackjack
{
    public partial class Form1 : Form
    {
        int money=2000, bet, sum1, sum2,card,red1=0,red2=0,red=0;
        PictureBox[] karte = new PictureBox[20];

        private void hitbutton_Click(object sender, EventArgs e)
        {
            sum1 = randomkarta(novaig(red1), sum1);
            br1.Text = sum1.ToString();
            red1++;
            if (sum1 > 21) lose();
            else if (sum1==21)win() ;

        }

        public void win() {
            MessageBox.Show("pobedili ste svaka cast!");
            money += bet;
            moneybox.Text = money.ToString();
            reset();
        }
        public void lose() {
            MessageBox.Show("Vise srece u sledecem izvalcenju");
            money -= bet;
            moneybox.Text = money.ToString();
            reset();
        }
        public void reset() {
            for (int i = 0; i < 20; i++)
            {
                this.Controls.Remove(karte[i]);
                karte[i] = null;
            }
            pictureBox1.Image = null;
            pictureBox2.Image = null;
            sum1 = 0;
            sum2 = 0;
            br1.Text = "";
            br2.Text = "";
            red1 = 0;
            red2 = 0;
            red = 0;
        }
        private void Form1_Load(object sender, EventArgs e)
        {
             
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void standbutton_Click(object sender, EventArgs e)
        {
            do
            {
            sum2 = randomkarta(novatop(red2), sum2);
            br2.Text = sum2.ToString();
            red2++;

            } while (sum2<=sum1);
            if (sum2 <= 21) lose();
            else win();
        }

        Random gen = new Random();
        public Form1()
        {
            InitializeComponent();
            moneybox.Text = money.ToString();
        }

        
        public int randomkarta(PictureBox pc,int suma)
        {
            card = gen.Next(1, 53);
            switch (card)
            {

                case 1:
                    {
                        pc.Image = Properties.Resources.ace_of_hearts;
                        if (suma > 10) suma += 1;
                        else suma += 11;
                         break;
                    }

                case 2:
                    {
                        pc.Image = Properties.Resources.ace_of_clubs;
                        if (suma > 10) suma += 1;
                        else suma += 11; break;
                    }

                case 3:
                    {
                        pc.Image = Properties.Resources.ace_of_diamonds;
                        if (suma > 10) suma += 1;
                        else suma += 11; break;
                    }

                case 4:
                    {
                        pc.Image = Properties.Resources.ace_of_diamonds;
                        if (suma > 10) suma += 1;
                        else suma += 11; break;
                    }

                case 5:
                    {
                        pc.Image = Properties.Resources._2_of_hearts;
                        suma += 2; break;
                    }

                case 6:
                    {
                        pc.Image = Properties.Resources._2_of_clubs;
                        suma += 2; break;
                    }

                case 7:
                    {
                        pc.Image = Properties.Resources._2_of_diamonds;
                        suma += 2; break;
                    }

                case 8:
                    {
                        pc.Image = Properties.Resources._2_of_diamonds;
                        suma += 2; break;
                    }

                case 9:
                    {
                        pc.Image = Properties.Resources._3_of_hearts;
                        suma += 3; break;
                    }

                case 10:
                    {
                        pc.Image = Properties.Resources._3_of_clubs;
                        suma += 3; break;
                    }

                case 11:
                    {
                        pc.Image = Properties.Resources._3_of_diamonds;
                        suma += 3; break;
                    }

                case 12:
                    {
                        pc.Image = Properties.Resources._3_of_diamonds;
                        suma += 3; break;
                    }

                case 13:
                    {
                        pc.Image = Properties.Resources._4_of_hearts;
                        suma += 4; break;
                    }

                case 14:
                    {
                        pc.Image = Properties.Resources._4_of_clubs;
                        suma += 4; break;
                    }

                case 15:
                    {
                        pc.Image = Properties.Resources._4_of_diamonds;
                        suma += 4; break;
                    }

                case 16:
                    {
                        pc.Image = Properties.Resources._4_of_diamonds;
                        suma += 4; break;
                    }

                case 17:
                    {
                        pc.Image = Properties.Resources._5_of_hearts;
                        suma += 5; break;
                    }

                case 18:
                    {
                        pc.Image = Properties.Resources._5_of_clubs;
                        suma += 5; break;
                    }

                case 19:
                    {
                        pc.Image = Properties.Resources._5_of_diamonds;
                        suma += 5; break;
                    }

                case 20:
                    {
                        pc.Image = Properties.Resources._5_of_diamonds;
                        suma += 5; break;
                    }

                case 21:
                    {
                        pc.Image = Properties.Resources._6_of_hearts;
                        suma += 6; break;
                    }

                case 22:
                    {
                        pc.Image = Properties.Resources._6_of_clubs;
                        suma += 6; break;
                    }

                case 23:
                    {
                        pc.Image = Properties.Resources._6_of_diamonds;
                        suma += 6; break;
                    }

                case 24:
                    {
                        pc.Image = Properties.Resources._6_of_diamonds;
                        suma += 6; break;
                    }

                case 25:
                    {
                        pc.Image = Properties.Resources._7_of_hearts;
                        suma += 7; break;
                    }

                case 26:
                    {
                        pc.Image = Properties.Resources._7_of_clubs;
                        suma += 7; break;
                    }

                case 27:
                    {
                        pc.Image = Properties.Resources._7_of_diamonds;
                        suma += 7; break;
                    }

                case 28:
                    {
                        pc.Image = Properties.Resources._7_of_diamonds;
                        suma += 7; break;
                    }

                case 29:
                    {
                        pc.Image = Properties.Resources._8_of_hearts;
                        suma += 8; break;
                    }

                case 30:
                    {
                        pc.Image = Properties.Resources._8_of_clubs;
                        suma += 8; break;
                    }

                case 31:
                    {
                        pc.Image = Properties.Resources._8_of_diamonds;
                        suma += 8; break;
                    }

                case 32:
                    {
                        pc.Image = Properties.Resources._8_of_diamonds;
                        suma += 8; break;
                    }

                case 33:
                    {
                        pc.Image = Properties.Resources._9_of_hearts;
                        suma += 9; break;
                    }

                case 34:
                    {
                        pc.Image = Properties.Resources._9_of_clubs;
                        suma += 9; break;
                    }

                case 35:
                    {
                        pc.Image = Properties.Resources._9_of_diamonds;
                        suma += 9; break;
                    }

                case 36:
                    {
                        pc.Image = Properties.Resources._9_of_diamonds;
                        suma += 9; break;
                    }

                case 37:
                    {
                        pc.Image = Properties.Resources._10_of_hearts;
                        suma += 10; break;
                    }

                case 38:
                    {
                        pc.Image = Properties.Resources._10_of_clubs;
                        suma += 10; break;
                    }

                case 39:
                    {
                        pc.Image = Properties.Resources._10_of_diamonds;
                        suma += 10; break;
                    }

                case 40:
                    {
                        pc.Image = Properties.Resources._10_of_diamonds;
                        suma += 10; break;
                    }

                case 41:
                    {
                        pc.Image = Properties.Resources.king_of_hearts;
                        suma += 10; break;
                    }

                case 42:
                    {
                        pc.Image = Properties.Resources.king_of_clubs;
                        suma += 10; break;
                    }

                case 43:
                    {
                        pc.Image = Properties.Resources.king_of_diamonds;
                        suma += 10; break;
                    }

                case 44:
                    {
                        pc.Image = Properties.Resources.king_of_diamonds;
                        suma += 10; break;
                    }

                case 45:
                    {
                        pc.Image = Properties.Resources.jack_of_hearts;
                        suma += 10; break;
                    }

                case 46:
                    {
                        pc.Image = Properties.Resources.jack_of_clubs;
                        suma += 10; break;
                    }

                case 47:
                    {
                        pc.Image = Properties.Resources.jack_of_diamonds;
                        suma += 10; break;
                    }

                case 48:
                    {
                        pc.Image = Properties.Resources.jack_of_diamonds;
                        suma += 10; break;
                    }

                case 49:
                    {
                        pc.Image = Properties.Resources.queen_of_hearts;
                        suma += 10; break;
                    }

                case 50:
                    {
                        pc.Image = Properties.Resources.queen_of_clubs;
                        suma += 10; break;
                    }

                case 51:
                    {
                        pc.Image = Properties.Resources.queen_of_diamonds;
                        suma += 10; break;
                    }

                case 52:
                    {
                        pc.Image = Properties.Resources.queen_of_diamonds;
                        suma += 10; break;
                    }
            }
            return suma;
        }
        public PictureBox novaig(int x)
        {
            PictureBox pc = new PictureBox();
            pc.Width = pictureBox1.Width;
            pc.Height = pictureBox1.Height;
            pc.SizeMode = pictureBox1.SizeMode;

            pc.Location = new Point(pictureBox1.Location.X + 50*x, pictureBox1.Location.Y);
            this.Controls.Add(pc);
            pc.BringToFront();
            karte[red] = pc;
            red++;
            return pc;
        }
        public PictureBox novatop(int x)
        {
            PictureBox pc = new PictureBox();
            pc.Width = pictureBox2.Width;
            pc.Height = pictureBox2.Height;
            pc.SizeMode = pictureBox2.SizeMode;

            pc.Location = new Point(pictureBox2.Location.X + 50 * x, pictureBox2.Location.Y);
            this.Controls.Add(pc);
            pc.BringToFront();
            karte[red] = pc;
            red++;
            return pc;
        }
        private void placebet_Click(object sender, EventArgs e)
        {
            
            bet = Convert.ToInt32(betbutt.Text);
            if (bet > money)
            {
                MessageBox.Show("Nemate dovoljno novca!");
            }
            else
            {
                sum1 = randomkarta(pictureBox1, sum1);
                br1.Text = sum1.ToString();
                red1++;

                sum2 = randomkarta(pictureBox2, sum2);
                br2.Text = sum2.ToString();
                red2++;

                sum1 = randomkarta(novaig(red1), sum1);
                br1.Text = sum1.ToString();
                red1++;
                if (sum1 == 21) win();
            }
        }
    }
}
