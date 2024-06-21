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
    public partial class Form3 : Form
    {
        public static bool klik;
        public static string imebrisanja;
        public static int pozbrisanja;

        public Form3()
        {
            InitializeComponent();
            klik = false;
            for (int i = 0; i < Form1.brklubova; i++)
            {
                comboBox1.Items.Add(Form1.klubniz[i]);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            klik = true;
            
            this.Close();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            imebrisanja = comboBox1.SelectedItem.ToString();
            for (int x = 0; x < Form1.brklubova; x++)
            {
                if (imebrisanja==Form1.klubniz[x])
                {
                    pozbrisanja = x;

                }
               
             
            }
        }
    }
}
