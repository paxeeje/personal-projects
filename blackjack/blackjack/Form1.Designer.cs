namespace blackjack
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.hitbutton = new System.Windows.Forms.Button();
            this.standbutton = new System.Windows.Forms.Button();
            this.placebet = new System.Windows.Forms.Button();
            this.betbutt = new System.Windows.Forms.TextBox();
            this.moneybox = new System.Windows.Forms.TextBox();
            this.br2 = new System.Windows.Forms.TextBox();
            this.br1 = new System.Windows.Forms.TextBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            this.SuspendLayout();
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackColor = System.Drawing.Color.Transparent;
            this.pictureBox1.Location = new System.Drawing.Point(430, 396);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(98, 179);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // pictureBox2
            // 
            this.pictureBox2.BackColor = System.Drawing.Color.Transparent;
            this.pictureBox2.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.pictureBox2.Location = new System.Drawing.Point(430, 37);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(98, 179);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 1;
            this.pictureBox2.TabStop = false;
            // 
            // hitbutton
            // 
            this.hitbutton.Location = new System.Drawing.Point(191, 476);
            this.hitbutton.Name = "hitbutton";
            this.hitbutton.Size = new System.Drawing.Size(101, 99);
            this.hitbutton.TabIndex = 2;
            this.hitbutton.Text = "HIT";
            this.hitbutton.UseVisualStyleBackColor = true;
            this.hitbutton.Click += new System.EventHandler(this.hitbutton_Click);
            // 
            // standbutton
            // 
            this.standbutton.Location = new System.Drawing.Point(298, 476);
            this.standbutton.Name = "standbutton";
            this.standbutton.Size = new System.Drawing.Size(101, 99);
            this.standbutton.TabIndex = 3;
            this.standbutton.Text = "STAND";
            this.standbutton.UseVisualStyleBackColor = true;
            this.standbutton.Click += new System.EventHandler(this.standbutton_Click);
            // 
            // placebet
            // 
            this.placebet.Location = new System.Drawing.Point(751, 540);
            this.placebet.Name = "placebet";
            this.placebet.Size = new System.Drawing.Size(225, 76);
            this.placebet.TabIndex = 4;
            this.placebet.Text = "PLACE BET";
            this.placebet.UseVisualStyleBackColor = true;
            this.placebet.Click += new System.EventHandler(this.placebet_Click);
            // 
            // betbutt
            // 
            this.betbutt.Location = new System.Drawing.Point(818, 502);
            this.betbutt.Multiline = true;
            this.betbutt.Name = "betbutt";
            this.betbutt.Size = new System.Drawing.Size(157, 38);
            this.betbutt.TabIndex = 5;
            // 
            // moneybox
            // 
            this.moneybox.Font = new System.Drawing.Font("Microsoft Sans Serif", 27.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.moneybox.Location = new System.Drawing.Point(751, 12);
            this.moneybox.Multiline = true;
            this.moneybox.Name = "moneybox";
            this.moneybox.Size = new System.Drawing.Size(224, 59);
            this.moneybox.TabIndex = 6;
            // 
            // br2
            // 
            this.br2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(37)))), ((int)(((byte)(184)))), ((int)(((byte)(37)))));
            this.br2.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.br2.Location = new System.Drawing.Point(430, 222);
            this.br2.Multiline = true;
            this.br2.Name = "br2";
            this.br2.Size = new System.Drawing.Size(98, 38);
            this.br2.TabIndex = 9;
            this.br2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // br1
            // 
            this.br1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(37)))), ((int)(((byte)(184)))), ((int)(((byte)(37)))));
            this.br1.Font = new System.Drawing.Font("Microsoft Sans Serif", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.br1.Location = new System.Drawing.Point(430, 352);
            this.br1.Multiline = true;
            this.br1.Name = "br1";
            this.br1.Size = new System.Drawing.Size(98, 38);
            this.br1.TabIndex = 10;
            this.br1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Green;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(980, 620);
            this.Controls.Add(this.br1);
            this.Controls.Add(this.br2);
            this.Controls.Add(this.moneybox);
            this.Controls.Add(this.betbutt);
            this.Controls.Add(this.placebet);
            this.Controls.Add(this.standbutton);
            this.Controls.Add(this.hitbutton);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.pictureBox1);
            this.DoubleBuffered = true;
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Button hitbutton;
        private System.Windows.Forms.Button standbutton;
        private System.Windows.Forms.Button placebet;
        private System.Windows.Forms.TextBox betbutt;
        private System.Windows.Forms.TextBox moneybox;
        private System.Windows.Forms.TextBox br2;
        private System.Windows.Forms.TextBox br1;
    }
}

