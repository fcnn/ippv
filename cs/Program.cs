﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ippv
{
    class Program
    {
        static void Main(string[] args)
        {
            PhoneNr.init();
            PhoneNr.add("80", "C80");
            PhoneNr.add("801", "C801");
            PhoneNr.add("8011", "C8011");
            PhoneNr.add("82", "C82");
            PhoneNr.add("821", "C821");
            PhoneNr.add("8211", "C8211");

            int cc, ld, ac;
            string iso;
            string phone;
            phone = "8095555"; cc = 0; ld = 0; ac = 0; iso = null;
            cc = PhoneNr.match(phone, ref ld, ref ac, ref iso);
            Console.WriteLine(phone + " -> " + cc + "," + ld + "," + ac + "," + iso);
            phone="80195555"; cc = 0; ld = 0; ac = 0; iso = null;
            cc = PhoneNr.match(phone, ref ld, ref ac, ref iso);
            Console.WriteLine(phone + " -> " + cc + "," + ld + "," + ac + "," + iso);
            phone = "801195555"; cc = 0; ld = 0; ac = 0; iso = null;
            cc = PhoneNr.match(phone, ref ld, ref ac, ref iso);
            Console.WriteLine(phone + " -> " + cc + "," + ld + "," + ac + "," + iso);
            phone = "821195555"; cc = 0; ld = 0; ac = 0; iso = null;
            cc = PhoneNr.match(phone, ref ld, ref ac, ref iso);
            Console.WriteLine(phone + " -> " + cc + "," + ld + "," + ac + "," + iso);
        }
    }
}
