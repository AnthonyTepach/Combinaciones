/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinaciones;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Combinaciones {
 
    public void archivo(){
         String nombreArchivo=null;
            FileWriter fichero = null;
        PrintWriter pw = null;
        Calendar c = new GregorianCalendar();
        Scanner ler=new Scanner(System.in);
       
        System.out.println("nombre del documento");
        String aadsaf=ler.next();
        nombreArchivo=aadsaf+".txt";
        try {
            fichero = new FileWriter(nombreArchivo);
            pw = new PrintWriter(fichero);
          //String prov[]={"SIEGWERK MEXICO","DISTRIBUIDORA GRAFICA DE OCCIDENTE SA DE CV","AZ LATINOAMERICANA"};
            //
            
            //String prov[]={"ZELLER","TOYO INK ARETS","PETREL"};
           // String prov[]={"CARMEN ANCIRA CUEVAS"};
            String prov[]={"CARLOS SANCHEZ CALDERON","NAZDAR","ACTEGA","ZELLER","TOYO INK ARETS","PETREL","SIEGWERK MEXICO","DISTRIBUIDORA GRAFICA DE OCCIDENTE SA DE CV","AZ LATINOAMERICANA","FORMAS INTELIGENTES"};
        String teg[]={"UV","AG","CO"};
        String selcol[]={"PANTONE 100","PANTONE 101","PANTONE 102","PANTONE 103","PANTONE 104","PANTONE 105","PANTONE 7401","PANTONE 7402","PANTONE 7403","PANTONE 7404","PANTONE 7405","PANTONE 7406","PANTONE 7407","PANTONE 2001","PANTONE 2002","PANTONE 2003","PANTONE 2004","PANTONE 2005","PANTONE 2006","PANTONE 2007","PANTONE 106","PANTONE 107","PANTONE 108","PANTONE 109","PANTONE 110","PANTONE 111","PANTONE 112","PANTONE 113","PANTONE 114","PANTONE 115","PANTONE 116","PANTONE 117","PANTONE 118","PANTONE 119","PANTONE 127","PANTONE 128","PANTONE 129","PANTONE 130","PANTONE 131","PANTONE 132","PANTONE 133","PANTONE 1205","PANTONE 1215","PANTONE 1225","PANTONE 1235","PANTONE 1245","PANTONE 1255","PANTONE 1265","PANTONE 120","PANTONE 121","PANTONE 122","PANTONE 123","PANTONE 124","PANTONE 125","PANTONE 126","PANTONE 7548","PANTONE 7549","PANTONE 7550","PANTONE 7551","PANTONE 7552","PANTONE 7553","PANTONE 7554","PANTONE 7555","PANTONE 7556","PANTONE 7557","PANTONE 7558","PANTONE 7559","PANTONE 7560","PANTONE 7561","PANTONE 134","PANTONE 135","PANTONE 136","PANTONE 137","PANTONE 138","PANTONE 139","PANTONE 140","PANTONE 2008","PANTONE 2009","PANTONE 2010","PANTONE 2011","PANTONE 2012","PANTONE 2013","PANTONE 2014","PANTONE 1345","PANTONE 1355","PANTONE 1365","PANTONE 1375","PANTONE 1385","PANTONE 1395","PANTONE 1405","PANTONE 141","PANTONE 142","PANTONE 143","PANTONE 144","PANTONE 145","PANTONE 146","PANTONE 147","PANTONE 7408","PANTONE 7409","PANTONE 7410","PANTONE 7411","PANTONE 7412","PANTONE 7413","PANTONE 7414","PANTONE 7562","PANTONE 7563","PANTONE 7564","PANTONE 7565","PANTONE 7566","PANTONE 7567","PANTONE 7568","PANTONE 7569","PANTONE 7570","PANTONE 7571","PANTONE 7572","PANTONE 7573","PANTONE 7574","PANTONE 7575","PANTONE 712","PANTONE 713","PANTONE 714","PANTONE 715","PANTONE 716","PANTONE 717","PANTONE 718","PANTONE 2015","PANTONE 2016","PANTONE 2017","PANTONE 2018","PANTONE 2019","PANTONE 2020","PANTONE 2021","PANTONE 148","PANTONE 149","PANTONE 150","PANTONE 151","PANTONE 152","PANTONE 153","PANTONE 154","PANTONE 155","PANTONE 156","PANTONE 157","PANTONE 158","PANTONE 159","PANTONE 160","PANTONE 161","PANTONE 1485","PANTONE 1495","PANTONE 1505","PANTONE 1525","PANTONE 1535","PANTONE 1545","PANTONE 1555","PANTONE 1565","PANTONE 1575","PANTONE 1585","PANTONE 1595","PANTONE 1605","PANTONE 1615","PANTONE 2022","PANTONE 2023","PANTONE 2024","PANTONE 2025","PANTONE 2026","PANTONE 2027","PANTONE 2028","PANTONE 162","PANTONE 163","PANTONE 164","PANTONE 165","PANTONE 166","PANTONE 167","PANTONE 168","PANTONE 7576","PANTONE 7577","PANTONE 7578","PANTONE 7579","PANTONE 7580","PANTONE 7581","PANTONE 7582","PANTONE 1625","PANTONE 1635","PANTONE 1645","PANTONE 1655","PANTONE 1665","PANTONE 1675","PANTONE 1685","PANTONE 169","PANTONE 170","PANTONE 171","PANTONE 172","PANTONE 173","PANTONE 174","PANTONE 175","PANTONE 7583","PANTONE 7584","PANTONE 7585","PANTONE 7586","PANTONE 7587","PANTONE 7588","PANTONE 7589","PANTONE 7590","PANTONE 7591","PANTONE 7592","PANTONE 7593","PANTONE 7594","PANTONE 7595","PANTONE 7596","PANTONE 7597","PANTONE 7598","PANTONE 7599","PANTONE 7600","PANTONE 7601","PANTONE 7602","PANTONE 7603","PANTONE 7604","PANTONE 7605","PANTONE 7606","PANTONE 7607","PANTONE 7608","PANTONE 7609","PANTONE 7610","PANTONE 2337","PANTONE 2338","PANTONE 2339","PANTONE 2340","PANTONE 2341","PANTONE 2342","PANTONE 2343","PANTONE 7611","PANTONE 7612","PANTONE 7613","PANTONE 7614","PANTONE 7615","PANTONE 7616","PANTONE 7617","PANTONE 7520","PANTONE 7521","PANTONE 7522","PANTONE 7523","PANTONE 7524","PANTONE 7525","PANTONE 7526","PANTONE 489","PANTONE 488","PANTONE 487","PANTONE 486","PANTONE 485","PANTONE 484","PANTONE 483","PANTONE 2029","PANTONE 2030","PANTONE 2031","PANTONE 2032","PANTONE 2033","PANTONE 2034","PANTONE 2035","PANTONE 2344","PANTONE 2345","PANTONE 2346","PANTONE 2347","PANTONE 2348","PANTONE 2349","PANTONE 2350","PANTONE 176","PANTONE 177","PANTONE 178","PANTONE 179","PANTONE 180","PANTONE 181","PANTONE 1765","PANTONE 1775","PANTONE 1785","PANTONE 1795","PANTONE 1805","PANTONE 1815","PANTONE 1767","PANTONE 1777","PANTONE 1787","PANTONE 1797","PANTONE 1807","PANTONE 1817","PANTONE 7618","PANTONE 7619","PANTONE 7620","PANTONE 7621","PANTONE 7622","PANTONE 7623","PANTONE 7624","PANTONE 7625","PANTONE 7626","PANTONE 7627","PANTONE 7628","PANTONE 7629","PANTONE 7630","PANTONE 7631","PANTONE 7415","PANTONE 7416","PANTONE 7417","PANTONE 7418","PANTONE 7419","PANTONE 7420","PANTONE 7421","PANTONE 182","PANTONE 183","PANTONE 184","PANTONE 185","PANTONE 186","PANTONE 187","PANTONE 188","PANTONE 196","PANTONE 197","PANTONE 198","PANTONE 199","PANTONE 200","PANTONE 201","PANTONE 202","PANTONE 189","PANTONE 190","PANTONE 191","PANTONE 192","PANTONE 193","PANTONE 194","PANTONE 195","PANTONE 1895","PANTONE 1905","PANTONE 1915","PANTONE 1925","PANTONE 1935","PANTONE 1945","PANTONE 1955","PANTONE 705","PANTONE 706","PANTONE 707","PANTONE 708","PANTONE 709","PANTONE 710","PANTONE 711","PANTONE 698","PANTONE 699","PANTONE 700","PANTONE 701","PANTONE 702","PANTONE 703","PANTONE 704","PANTONE 203","PANTONE 204","PANTONE 205","PANTONE 206","PANTONE 207","PANTONE 208","PANTONE 209","PANTONE 210","PANTONE 211","PANTONE 212","PANTONE 213","PANTONE 214","PANTONE 215","PANTONE 216","PANTONE 2036","PANTONE 2037","PANTONE 2038","PANTONE 2039","PANTONE 2040","PANTONE 2041","PANTONE 2042","PANTONE 7422","PANTONE 7423","PANTONE 7424","PANTONE 7425","PANTONE 7426","PANTONE 7427","PANTONE 7428","PANTONE 7632","PANTONE 7633","PANTONE 7634","PANTONE 7635","PANTONE 7636","PANTONE 7637","PANTONE 7638","PANTONE 217","PANTONE 218","PANTONE 219","PANTONE 220","PANTONE 221","PANTONE 222","PANTONE 7639","PANTONE 7640","PANTONE 7641","PANTONE 7642","PANTONE 7643","PANTONE 7644","PANTONE 7645","PANTONE 223","PANTONE 224","PANTONE 225","PANTONE 226","PANTONE 227","PANTONE 228","PANTONE 229","PANTONE 230","PANTONE 231","PANTONE 232","PANTONE 233","PANTONE 234","PANTONE 235","PANTONE 670","PANTONE 671","PANTONE 672","PANTONE 673","PANTONE 674","PANTONE 675","PANTONE 676","PANTONE 2043","PANTONE 2044","PANTONE 2045","PANTONE 2046","PANTONE 2047","PANTONE 2048","PANTONE 2049","PANTONE 677","PANTONE 678","PANTONE 679","PANTONE 680","PANTONE 681","PANTONE 682","PANTONE 683","PANTONE 2050","PANTONE 2051","PANTONE 2052","PANTONE 2053","PANTONE 2054","PANTONE 2055","PANTONE 2056","PANTONE 684","PANTONE 685","PANTONE 686","PANTONE 687","PANTONE 688","PANTONE 689","PANTONE 690","PANTONE 510","PANTONE 509","PANTONE 508","PANTONE 507","PANTONE 506","PANTONE 505","PANTONE 504","PANTONE 7429","PANTONE 7430","PANTONE 7431","PANTONE 7432","PANTONE 7433","PANTONE 7434","PANTONE 7435","PANTONE 691","PANTONE 692","PANTONE 693","PANTONE 694","PANTONE 695","PANTONE 696","PANTONE 697","PANTONE 496","PANTONE 495","PANTONE 494","PANTONE 493","PANTONE 492","PANTONE 491","PANTONE 490","PANTONE 503","PANTONE 502","PANTONE 501","PANTONE 500","PANTONE 499","PANTONE 498","PANTONE 497","PANTONE 5035","PANTONE 5025","PANTONE 5015","PANTONE 5005","PANTONE 4995","PANTONE 4985","PANTONE 4975","PANTONE 236","PANTONE 237","PANTONE 238","PANTONE 239","PANTONE 240","PANTONE 241","PANTONE 242","PANTONE 2057","PANTONE 2058","PANTONE 2059","PANTONE 2060","PANTONE 2061","PANTONE 2062","PANTONE 2063","PANTONE 2365","PANTONE 2375","PANTONE 2385","PANTONE 2395","PANTONE 2405","PANTONE 2415","PANTONE 2425","PANTONE 243","PANTONE 244","PANTONE 245","PANTONE 246","PANTONE 247","PANTONE 248","PANTONE 249","PANTONE 7646","PANTONE 7647","PANTONE 7648","PANTONE 7649","PANTONE 7650","PANTONE 7651","PANTONE 7652","PANTONE 250","PANTONE 251","PANTONE 252","PANTONE 253","PANTONE 254","PANTONE 255","PANTONE 2064","PANTONE 2065","PANTONE 2066","PANTONE 2067","PANTONE 2068","PANTONE 2069","PANTONE 2070","PANTONE 517","PANTONE 516","PANTONE 515","PANTONE 514","PANTONE 513","PANTONE 512","PANTONE 511","PANTONE 2351","PANTONE 2352","PANTONE 2353","PANTONE 2354","PANTONE 2355","PANTONE 2356","PANTONE 2357","PANTONE 7653","PANTONE 7654","PANTONE 7655","PANTONE 7656","PANTONE 7657","PANTONE 7658","PANTONE 7659","PANTONE 5175","PANTONE 5165","PANTONE 5155","PANTONE 5145","PANTONE 5135","PANTONE 5125","PANTONE 5115","PANTONE 5245","PANTONE 5235","PANTONE 5225","PANTONE 5215","PANTONE 5205","PANTONE 5195","PANTONE 5185","PANTONE 524","PANTONE 523","PANTONE 522","PANTONE 521","PANTONE 520","PANTONE 519","PANTONE 518","PANTONE 7436","PANTONE 7437","PANTONE 7438","PANTONE 7439","PANTONE 7440","PANTONE 7441","PANTONE 7442","PANTONE 2562","PANTONE 2572","PANTONE 2582","PANTONE 2592","PANTONE 2602","PANTONE 2612","PANTONE 2622","PANTONE 531","PANTONE 530","PANTONE 529","PANTONE 528","PANTONE 527","PANTONE 526","PANTONE 525","PANTONE 256","PANTONE 257","PANTONE 258","PANTONE 259","PANTONE 260","PANTONE 261","PANTONE 262","PANTONE 2563","PANTONE 2573","PANTONE 2583","PANTONE 2593","PANTONE 2603","PANTONE 2613","PANTONE 2623","PANTONE 2078","PANTONE 2079","PANTONE 2080","PANTONE 2081","PANTONE 2082","PANTONE 2083","PANTONE 2084","PANTONE 2071","PANTONE 2072","PANTONE 2073","PANTONE 2074","PANTONE 2075","PANTONE 2076","PANTONE 2077","PANTONE 7660","PANTONE 7661","PANTONE 7662","PANTONE 7663","PANTONE 7664","PANTONE 7665","PANTONE 7666","PANTONE 2567","PANTONE 2577","PANTONE 2587","PANTONE 2597","PANTONE 2607","PANTONE 2617","PANTONE 2627","PANTONE 263","PANTONE 264","PANTONE 265","PANTONE 266","PANTONE 267","PANTONE 268","PANTONE 269","PANTONE 2085","PANTONE 2086","PANTONE 2087","PANTONE 2088","PANTONE 2089","PANTONE 2090","PANTONE 2091","PANTONE 2635","PANTONE 2645","PANTONE 2655","PANTONE 2665","PANTONE 2685","PANTONE 2695","PANTONE 2092","PANTONE 2093","PANTONE 2094","PANTONE 2095","PANTONE 2096","PANTONE 2097","PANTONE 2098","PANTONE 2099","PANTONE 2100","PANTONE 2101","PANTONE 2102","PANTONE 2103","PANTONE 2104","PANTONE 2105","PANTONE 270","PANTONE 271","PANTONE 272","PANTONE 273","PANTONE 274","PANTONE 275","PANTONE 276","PANTONE 2705","PANTONE 2715","PANTONE 2725","PANTONE 2735","PANTONE 2745","PANTONE 2755","PANTONE 2765","PANTONE 7667","PANTONE 7668","PANTONE 7669","PANTONE 7670","PANTONE 7671","PANTONE 7672","PANTONE 7673","PANTONE 7443","PANTONE 7444","PANTONE 7445","PANTONE 7446","PANTONE 7447","PANTONE 7448","PANTONE 7449","PANTONE 7674","PANTONE 7675","PANTONE 7676","PANTONE 7677","PANTONE 7678","PANTONE 7679","PANTONE 7680","PANTONE 663","PANTONE 664","PANTONE 665","PANTONE 666","PANTONE 667","PANTONE 668","PANTONE 669","PANTONE 5315","PANTONE 5305","PANTONE 5295","PANTONE 5285","PANTONE 5275","PANTONE 5265","PANTONE 5255","PANTONE 2358","PANTONE 2359","PANTONE 2360","PANTONE 2361","PANTONE 2362","PANTONE 2363","PANTONE 2364","PANTONE 2106","PANTONE 2107","PANTONE 2108","PANTONE 2109","PANTONE 2110","PANTONE 2111","PANTONE 2112","PANTONE 2113","PANTONE 2114","PANTONE 2115","PANTONE 2116","PANTONE 2117","PANTONE 2118","PANTONE 2119","PANTONE 2366","PANTONE 2367","PANTONE 2368","PANTONE 2369","PANTONE 2370","PANTONE 2371","PANTONE 2372","PANTONE 538","PANTONE 537","PANTONE 536","PANTONE 535","PANTONE 534","PANTONE 533","PANTONE 532","PANTONE 7541","PANTONE 7542","PANTONE 7543","PANTONE 7544","PANTONE 7545","PANTONE 7546","PANTONE 7547","PANTONE 2162","PANTONE 2163","PANTONE 2164","PANTONE 2165","PANTONE 2166","PANTONE 2167","PANTONE 2168","PANTONE 2373","PANTONE 2374","PANTONE 2375","PANTONE 2376","PANTONE 2377","PANTONE 2378","PANTONE 2379","PANTONE 2380","PANTONE 552","PANTONE 551","PANTONE 550","PANTONE 549","PANTONE 548","PANTONE 547","PANTONE 546","PANTONE 5455","PANTONE 5445","PANTONE 5435","PANTONE 5425","PANTONE 5415","PANTONE 5405","PANTONE 5395","PANTONE 2155","PANTONE 2156","PANTONE 2157","PANTONE 2158","PANTONE 2159","PANTONE 2160","PANTONE 2161","PANTONE 2134","PANTONE 2135","PANTONE 2136","PANTONE 2137","PANTONE 2138","PANTONE 2139","PANTONE 2140","PANTONE 642","PANTONE 643","PANTONE 644","PANTONE 645","PANTONE 646","PANTONE 647","PANTONE 648","PANTONE 649","PANTONE 650","PANTONE 651","PANTONE 652","PANTONE 653","PANTONE 654","PANTONE 655","PANTONE 656","PANTONE 657","PANTONE 658","PANTONE 659","PANTONE 660","PANTONE 661","PANTONE 662","PANTONE 2127","PANTONE 2128","PANTONE 2129","PANTONE 2130","PANTONE 2131","PANTONE 2132","PANTONE 2133","PANTONE 7450","PANTONE 7451","PANTONE 7452","PANTONE 7453","PANTONE 7454","PANTONE 7455","PANTONE 7456","PANTONE 2120","PANTONE 2121","PANTONE 2122","PANTONE 2123","PANTONE 2124","PANTONE 2125","PANTONE 2126","PANTONE 2706","PANTONE 2716","PANTONE 2726","PANTONE 2736","PANTONE 2746","PANTONE 2756","PANTONE 2766","PANTONE 2708","PANTONE 2718","PANTONE 2728","PANTONE 2738","PANTONE 2748","PANTONE 2758","PANTONE 2768","PANTONE 2707","PANTONE 2717","PANTONE 2727","PANTONE 2737","PANTONE 2747","PANTONE 2757","PANTONE 2767","PANTONE 277","PANTONE 278","PANTONE 279","PANTONE 280","PANTONE 281","PANTONE 282","PANTONE 283","PANTONE 284","PANTONE 285","PANTONE 286","PANTONE 287","PANTONE 288","PANTONE 289","PANTONE 7681","PANTONE 7682","PANTONE 7683","PANTONE 7684","PANTONE 7685","PANTONE 7686","PANTONE 7687","PANTONE 2141","PANTONE 2142","PANTONE 2143","PANTONE 2144","PANTONE 2145","PANTONE 2146","PANTONE 2147","PANTONE 545","PANTONE 544","PANTONE 543","PANTONE 542","PANTONE 541","PANTONE 540","PANTONE 539","PANTONE 290","PANTONE 291","PANTONE 292","PANTONE 293","PANTONE 294","PANTONE 295","PANTONE 296","PANTONE 2905","PANTONE 2915","PANTONE 2925","PANTONE 2935","PANTONE 2945","PANTONE 2955","PANTONE 2965","PANTONE 2169","PANTONE 2170","PANTONE 2171","PANTONE 2172","PANTONE 2173","PANTONE 2174","PANTONE 2175","PANTONE 2381","PANTONE 2382","PANTONE 2383","PANTONE 2384","PANTONE 2385","PANTONE 2386","PANTONE 2387","PANTONE 2388","PANTONE 297","PANTONE 298","PANTONE 299","PANTONE 300","PANTONE 301","PANTONE 302","PANTONE 303","PANTONE 7688","PANTONE 7689","PANTONE 7690","PANTONE 7691","PANTONE 7692","PANTONE 7693","PANTONE 7694","PANTONE 2148","PANTONE 2149","PANTONE 2150","PANTONE 2151","PANTONE 2152","PANTONE 2153","PANTONE 2154","PANTONE 2183","PANTONE 2184","PANTONE 2185","PANTONE 2186","PANTONE 2187","PANTONE 2188","PANTONE 2189","PANTONE 2975","PANTONE 2985","PANTONE 2995","PANTONE 3005","PANTONE 3015","PANTONE 3025","PANTONE 3035","PANTONE 2190","PANTONE 2191","PANTONE 2192","PANTONE 2193","PANTONE 2194","PANTONE 2195","PANTONE 2196","PANTONE 7695","PANTONE 7696","PANTONE 7697","PANTONE 7698","PANTONE 7699","PANTONE 7700","PANTONE 7701","PANTONE 2176","PANTONE 2177","PANTONE 2178","PANTONE 2179","PANTONE 2180","PANTONE 2181","PANTONE 2182","PANTONE 2204","PANTONE 2205","PANTONE 2206","PANTONE 2207","PANTONE 2208","PANTONE 2209","PANTONE 2210","PANTONE 7457","PANTONE 7458","PANTONE 7459","PANTONE 7460","PANTONE 7461","PANTONE 7462","PANTONE 7463","PANTONE 304","PANTONE 305","PANTONE 306","PANTONE 307","PANTONE 308","PANTONE 309","PANTONE 635","PANTONE 636","PANTONE 637","PANTONE 638","PANTONE 639","PANTONE 640","PANTONE 641","PANTONE 2389","PANTONE 2390","PANTONE 2391","PANTONE 2392","PANTONE 2393","PANTONE 2394","PANTONE 2395","PANTONE 7702","PANTONE 7703","PANTONE 7704","PANTONE 7705","PANTONE 7706","PANTONE 7707","PANTONE 7708","PANTONE 2197","PANTONE 2198","PANTONE 2199","PANTONE 2200","PANTONE 2201","PANTONE 2202","PANTONE 2203","PANTONE 628","PANTONE 629","PANTONE 630","PANTONE 631","PANTONE 632","PANTONE 633","PANTONE 634","PANTONE 310","PANTONE 311","PANTONE 312","PANTONE 313","PANTONE 314","PANTONE 315","PANTONE 316","PANTONE 3105","PANTONE 3115","PANTONE 3125","PANTONE 3135","PANTONE 3145","PANTONE 3155","PANTONE 3165","PANTONE 7709","PANTONE 7710","PANTONE 7711","PANTONE 7712","PANTONE 7713","PANTONE 7714","PANTONE 7715","PANTONE 2218","PANTONE 2219","PANTONE 2220","PANTONE 2221","PANTONE 2222","PANTONE 2223","PANTONE 2224","PANTONE 317","PANTONE 318","PANTONE 319","PANTONE 320","PANTONE 321","PANTONE 322","PANTONE 323","PANTONE 2225","PANTONE 2226","PANTONE 2227","PANTONE 2228","PANTONE 2229","PANTONE 2230","PANTONE 2231","PANTONE 7464","PANTONE 7465","PANTONE 7466","PANTONE 7467","PANTONE 7468","PANTONE 7469","PANTONE 7470","PANTONE 7471","PANTONE 7472","PANTONE 7473","PANTONE 7474","PANTONE 7475","PANTONE 7476","PANTONE 7477","PANTONE 2211","PANTONE 2212","PANTONE 2213","PANTONE 2214","PANTONE 2215","PANTONE 2216","PANTONE 2217","PANTONE 5523","PANTONE 5513","PANTONE 5503","PANTONE 5493","PANTONE 5483","PANTONE 5473","PANTONE 5463","PANTONE 2232","PANTONE 2233","PANTONE 2234","PANTONE 2235","PANTONE 2236","PANTONE 2237","PANTONE 2238","PANTONE 7716","PANTONE 7717","PANTONE 7718","PANTONE 7719","PANTONE 7720","PANTONE 7721","PANTONE 7722","PANTONE 324","PANTONE 325","PANTONE 326","PANTONE 327","PANTONE 328","PANTONE 329","PANTONE 330","PANTONE 3242","PANTONE 3252","PANTONE 3262","PANTONE 3272","PANTONE 3282","PANTONE 3292","PANTONE 3302","PANTONE 2397","PANTONE 2398","PANTONE 2399","PANTONE 2400","PANTONE 2401","PANTONE 2402","PANTONE 2403","PANTONE 3245","PANTONE 3255","PANTONE 3265","PANTONE 3275","PANTONE 3285","PANTONE 3295","PANTONE 3305","PANTONE 3248","PANTONE 3258","PANTONE 3268","PANTONE 3278","PANTONE 3288","PANTONE 3298","PANTONE 3308","PANTONE 566","PANTONE 565","PANTONE 564","PANTONE 563","PANTONE 562","PANTONE 561","PANTONE 560","PANTONE 573","PANTONE 572","PANTONE 571","PANTONE 570","PANTONE 569","PANTONE 568","PANTONE 567","PANTONE 559","PANTONE 558","PANTONE 557","PANTONE 556","PANTONE 555","PANTONE 554","PANTONE 553","PANTONE 2404","PANTONE 2406","PANTONE 2407","PANTONE 2408","PANTONE 2409","PANTONE 2410","PANTONE 2411","PANTONE 5595","PANTONE 5585","PANTONE 5575","PANTONE 5565","PANTONE 5555","PANTONE 5545","PANTONE 5535","PANTONE 5665","PANTONE 5655","PANTONE 5645","PANTONE 5635","PANTONE 5625","PANTONE 5615","PANTONE 5605","PANTONE 5527","PANTONE 5517","PANTONE 5507","PANTONE 5497","PANTONE 5487","PANTONE 5477","PANTONE 5467","PANTONE 621","PANTONE 622","PANTONE 623","PANTONE 624","PANTONE 625","PANTONE 626","PANTONE 627","PANTONE 331","PANTONE 332","PANTONE 333","PANTONE 334","PANTONE 335","PANTONE 336","PANTONE 2239","PANTONE 2240","PANTONE 2241","PANTONE 2242","PANTONE 2243","PANTONE 2244","PANTONE 2245","PANTONE 337","PANTONE 338","PANTONE 339","PANTONE 340","PANTONE 341","PANTONE 342","PANTONE 343","PANTONE 7723","PANTONE 7724","PANTONE 7725","PANTONE 7726","PANTONE 7727","PANTONE 7728","PANTONE 7729","PANTONE 3375","PANTONE 3385","PANTONE 3395","PANTONE 3405","PANTONE 3415","PANTONE 3425","PANTONE 3435","PANTONE 2246","PANTONE 2247","PANTONE 2248","PANTONE 2249","PANTONE 2250","PANTONE 2251","PANTONE 2252","PANTONE 2412","PANTONE 2413","PANTONE 2414","PANTONE 2415","PANTONE 2416","PANTONE 2417","PANTONE 2418","PANTONE 2419","PANTONE 344","PANTONE 345","PANTONE 346","PANTONE 347","PANTONE 348","PANTONE 349","PANTONE 350","PANTONE 351","PANTONE 352","PANTONE 353","PANTONE 354","PANTONE 355","PANTONE 356","PANTONE 357","PANTONE 7478","PANTONE 7479","PANTONE 7480","PANTONE 7481","PANTONE 7482","PANTONE 7483","PANTONE 7484","PANTONE 2253","PANTONE 2254","PANTONE 2255","PANTONE 2256","PANTONE 2257","PANTONE 2258","PANTONE 2259","PANTONE 7730","PANTONE 7731","PANTONE 7732","PANTONE 7733","PANTONE 7734","PANTONE 7735","PANTONE 7736","PANTONE 7737","PANTONE 7738","PANTONE 7739","PANTONE 7740","PANTONE 7741","PANTONE 7742","PANTONE 7743","PANTONE 2260","PANTONE 2261","PANTONE 2262","PANTONE 2263","PANTONE 2264","PANTONE 2265","PANTONE 2266","PANTONE 358","PANTONE 359","PANTONE 360","PANTONE 361","PANTONE 362","PANTONE 363","PANTONE 364","PANTONE 2267","PANTONE 2268","PANTONE 2269","PANTONE 2270","PANTONE 2271","PANTONE 2272","PANTONE 2273","PANTONE 2420","PANTONE 2421","PANTONE 2422","PANTONE 2423","PANTONE 2424","PANTONE 2425","PANTONE 2426","PANTONE 2427","PANTONE 7485","PANTONE 7486","PANTONE 7487","PANTONE 7488","PANTONE 7489","PANTONE 7490","PANTONE 7491","PANTONE 2274","PANTONE 2275","PANTONE 2276","PANTONE 2277","PANTONE 2278","PANTONE 2279","PANTONE 2280","PANTONE 365","PANTONE 366","PANTONE 367","PANTONE 368","PANTONE 369","PANTONE 370","PANTONE 371","PANTONE 2281","PANTONE 2282","PANTONE 2283","PANTONE 2284","PANTONE 2285","PANTONE 2286","PANTONE 2287","PANTONE 372","PANTONE 373","PANTONE 374","PANTONE 375","PANTONE 376","PANTONE 377","PANTONE 378","PANTONE 2288","PANTONE 2289","PANTONE 2290","PANTONE 2291","PANTONE 2292","PANTONE 2293","PANTONE 2294","PANTONE 2295","PANTONE 2296","PANTONE 2297","PANTONE 2298","PANTONE 2299","PANTONE 2300","PANTONE 2301","PANTONE 580","PANTONE 579","PANTONE 578","PANTONE 577","PANTONE 576","PANTONE 575","PANTONE 574","PANTONE 5807","PANTONE 5797","PANTONE 5787","PANTONE 5777","PANTONE 5767","PANTONE 5757","PANTONE 5747","PANTONE 5875","PANTONE 5865","PANTONE 5855","PANTONE 5845","PANTONE 5835","PANTONE 5825","PANTONE 5815","PANTONE 5803","PANTONE 5793","PANTONE 5783","PANTONE 5773","PANTONE 5763","PANTONE 5753","PANTONE 5743","PANTONE 7492","PANTONE 7493","PANTONE 7494","PANTONE 7495","PANTONE 7496","PANTONE 7497","PANTONE 7498","PANTONE 2302","PANTONE 2303","PANTONE 2304","PANTONE 2305","PANTONE 2306","PANTONE 2307","PANTONE 2308","PANTONE 7744","PANTONE 7745","PANTONE 7746","PANTONE 7747","PANTONE 7748","PANTONE 7749","PANTONE 7750","PANTONE 379","PANTONE 380","PANTONE 381","PANTONE 382","PANTONE 383","PANTONE 384","PANTONE 385","PANTONE 386","PANTONE 387","PANTONE 388","PANTONE 389","PANTONE 390","PANTONE 391","PANTONE 392","PANTONE 587","PANTONE 586","PANTONE 585","PANTONE 584","PANTONE 583","PANTONE 582","PANTONE 581","PANTONE 393","PANTONE 394","PANTONE 395","PANTONE 396","PANTONE 397","PANTONE 398","PANTONE 399","PANTONE 3935","PANTONE 3945","PANTONE 3955","PANTONE 3965","PANTONE 3975","PANTONE 3985","PANTONE 3995","PANTONE 600","PANTONE 601","PANTONE 602","PANTONE 603","PANTONE 604","PANTONE 605","PANTONE 606","PANTONE 607","PANTONE 608","PANTONE 609","PANTONE 610","PANTONE 611","PANTONE 612","PANTONE 613","PANTONE 461","PANTONE 460","PANTONE 459","PANTONE 458","PANTONE 457","PANTONE 456","PANTONE 455","PANTONE 614","PANTONE 615","PANTONE 616","PANTONE 617","PANTONE 618","PANTONE 619","PANTONE 620","PANTONE 7751","PANTONE 7752","PANTONE 7753","PANTONE 7754","PANTONE 7755","PANTONE 7756","PANTONE 7757","PANTONE 7758","PANTONE 7759","PANTONE 7760","PANTONE 7761","PANTONE 7762","PANTONE 7763","PANTONE 7764","PANTONE 7765","PANTONE 7766","PANTONE 7767","PANTONE 7768","PANTONE 7769","PANTONE 7770","PANTONE 7771","PANTONE 4545","PANTONE 4535","PANTONE 4525","PANTONE 4515","PANTONE 4505","PANTONE 4495","PANTONE 4485","PANTONE 2323","PANTONE 2324","PANTONE 2325","PANTONE 2326","PANTONE 2327","PANTONE 2328","PANTONE 2329","PANTONE 454","PANTONE 453","PANTONE 452","PANTONE 451","PANTONE 450","PANTONE 449","PANTONE 448","PANTONE 7499","PANTONE 7500","PANTONE 7501","PANTONE 7502","PANTONE 7503","PANTONE 7504","PANTONE 7505","PANTONE 468","PANTONE 467","PANTONE 466","PANTONE 465","PANTONE 464","PANTONE 463","PANTONE 462","PANTONE 7506","PANTONE 7507","PANTONE 7508","PANTONE 7509","PANTONE 7510","PANTONE 7511","PANTONE 7512","PANTONE 719","PANTONE 720","PANTONE 721","PANTONE 722","PANTONE 723","PANTONE 724","PANTONE 725","PANTONE 475","PANTONE 474","PANTONE 473","PANTONE 472","PANTONE 471","PANTONE 470","PANTONE 469","PANTONE 726","PANTONE 727","PANTONE 728","PANTONE 729","PANTONE 730","PANTONE 731","PANTONE 732","PANTONE 2316","PANTONE 2317","PANTONE 2318","PANTONE 2319","PANTONE 2320","PANTONE 2321","PANTONE 2322","PANTONE 2309","PANTONE 2310","PANTONE 2311","PANTONE 2312","PANTONE 2313","PANTONE 2314","PANTONE 2315","PANTONE 4685","PANTONE 4675","PANTONE 4665","PANTONE 4655","PANTONE 4645","PANTONE 4635","PANTONE 4625","PANTONE 7513","PANTONE 7514","PANTONE 7515","PANTONE 7516","PANTONE 7517","PANTONE 7518","PANTONE 7519","PANTONE 4755","PANTONE 4745","PANTONE 4735","PANTONE 4725","PANTONE 4715","PANTONE 4705","PANTONE 4695","PANTONE 482","PANTONE 481","PANTONE 480","PANTONE 479","PANTONE 478","PANTONE 477","PANTONE 476","PANTONE 7527","PANTONE 7528","PANTONE 7529","PANTONE 7530","PANTONE 7531","PANTONE 7532","PANTONE 7533","PANTONE 7534","PANTONE 7535","PANTONE 7536","PANTONE 7537","PANTONE 7538","PANTONE 7539","PANTONE 7540","PANTONE 427","PANTONE 428","PANTONE 429","PANTONE 430","PANTONE 431","PANTONE 432","PANTONE 433","PANTONE 420","PANTONE 421","PANTONE 422","PANTONE 423","PANTONE 424","PANTONE 425","PANTONE 426","PANTONE 441","PANTONE 442","PANTONE 443","PANTONE 444","PANTONE 445","PANTONE 446","PANTONE 447","PANTONE 413","PANTONE 414","PANTONE 415","PANTONE 416","PANTONE 417","PANTONE 418","PANTONE 419","PANTONE 2330","PANTONE 2331","PANTONE 2332","PANTONE 2333","PANTONE 2334","PANTONE 2335","PANTONE 2336","PANTONE 400","PANTONE 401","PANTONE 402","PANTONE 403","PANTONE 404","PANTONE 405","PANTONE 406","PANTONE 407","PANTONE 408","PANTONE 409","PANTONE 410","PANTONE 411","PANTONE 412","PANTONE 434","PANTONE 435","PANTONE 436","PANTONE 437","PANTONE 438","PANTONE 439","PANTONE 440","PANTONE WARM GRAY 1","PANTONE WARM GRAY 2","PANTONE WARM GRAY 3","PANTONE WARM GRAY 4","PANTONE WARM GRAY 5","PANTONE WARM GRAY 6","PANTONE WARM GRAY 7","PANTONE WARM GRAY 8","PANTONE WARM GRAY 9","PANTONE WARM GRAY 10","PANTONE COOL GRAY 1","PANTONE COOL GRAY 2","PANTONE COOL GRAY 3","PANTONE COOL GRAY 4","PANTONE COOL GRAY 5","PANTONE COOL GRAY 6","PANTONE COOL GRAY 7","PANTONE COOL GRAY 8","PANTONE COOL GRAY 9","PANTONE COOL GRAY 10","PANTONE COOL GRAY 11","PANTONE BLACK 2","PANTONE BLACK 3","PANTONE BLACK 4","PANTONE BLACK 5","PANTONE BLACK 6","PANTONE BLACK 7","PANTONE 1788"};
        //String pandir[]={"PANTONE AMARILLO","PANTONE AMARILLO 12","PANTONE ANARANGADO 21","PANTONE BRIGTH RED","PANTONE WARM RED ","PANTONE RED 32","PANTONE RUBINE RED","PANTONE RHODAMINE RED","PANTONE PINK","PANTONE PURPLE","PANTONE MEDIUM PURPLE","PANTONE VIOLET","PANTONE AZUL 72","PANTONE DARK BLUE","PANTONE REFLEX BLUE","PANTONE PROCESS BLUE","PANTONE GREEN","PANTONE NEGRO","PANTONE AMARILLO 131","PANTONE ROJPO 331","PANTONE MAGENTA 521","PANTONE VIOLETA 631","PANTONE AZUL 821","PANTONE VERDE 921","PANTONE NEGRO 961","PANTONE 801","PANTONE 802","PANTONE 803","PANTONE 804","PANTONE 805","PANTONE 806","PANTONE 807","PANTONE 871","PANTONE 872","PANTONE 873","PANTONE 874","PANTONE 875","PANTONE 876","PANTONE 877"};
        //String selcol[]={"BLANCO IMPRIMIBLE"};	
        //"INVISIBLE","FLOURECENTE","TERMOCROMATICA","OVI","FOTOCROMATICA","BITONAL"
        //INVISIBLE AZUL", "INVISIBLE ROJA", "INVISIBLE AMARILLA"
        //String esp[]={"FOTOCROMATICA MORADA"};
        //String z[]={"NEGRO PROCESS"};
        int contador;
            System.out.println("iniciar en:");
        contador = ler.nextInt();
        int p=prov.length,t=teg.length;
        //String a=String.format("%06d",i);
        for (int i = 0; i < p; i++) {
            //System.out.println(i);
            for (int j = 0; j <t; j++) {
                for (int k = 0; k <selcol.length; k++) {
                    contador++;
                    pw.println("A001-T-SEL-"+teg[j]+"-"+String.format("%06d",k)+"\t"+selcol[k]+"\t"+prov[i]+"\t FLEXO");
                }
            }
        }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }

    }
    }
    public static void main(String[] args) {
        new Combinaciones().archivo();
        System.out.println();
    }
} 