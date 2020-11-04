package ru.mirea.num5;

import java.util.Scanner;

public class TreugPosled
    {
        public static int recus(int n)
        {
            return n;
        }

        public static void main(String[] args)
        {
            Scanner cin = new Scanner(System.in);
            int n = cin.nextInt();
            int u=0,sum=0;
            int i=1;
            // for (int i =1;i<n+1;i++)
            while(i<n+1)
            {
                u++;
                for (int j =0;j<u;j++)
                {
                    sum++;
                    recus(i);
                    System.out.print(recus(i));
                    if (sum==n)
                    {
                        break;
                    }
                }
                if (sum==n)
                {
                    break;
                }
                i++;
            }
        }
    }
