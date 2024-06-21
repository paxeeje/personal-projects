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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
            klik = false;
        }
        Form1 Form1 = new Form1();
        public static string klub;
        public static string bodovi;
        public static string golovi;
        public static string utakmice;
        public static bool klik;
        public void button1_Click(object sender, EventArgs e)
        {
            klik= true;  
            klub = textBox1.Text;
            bodovi = textBox2.Text;
            golovi = textBox3.Text;
            utakmice = textBox4.Text;
            bool ubacen = false;
            for (int i = 0; i < Form1.brklubova; i++)
            {
                if (klub==Form1.klubniz[i])
                {
                    ubacen = true;
                }

                
            }
            if (ubacen)
            {
                MessageBox.Show("Tim je već ubačen");

            }
            else  this.Close();


        }
    }
}
