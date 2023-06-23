import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChiaBanhChung {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("nhap vao so nhom: ");
        int nhom = scanner.nextInt();
        ArrayList arr = new ArrayList<>(nhom);
        System.out.println("nhap vao so nguoi tung nhom: ");
        int nguoi;
        do {
             nguoi = scanner.nextInt();
            arr.add(nguoi);
        } while (nhom > arr.size());
        Collections.sort(arr);

            for(int y=0;y<arr.size();y++) {
                int o = (int) arr.get(y);
                if(o==4){
                    arr.remove(y);
                    count++;
                    y -=1;
                }
            }

            for(int z=0;z<arr.size()/2;z++) {
                int p = (int) arr.get(z);
                for(int w=arr.size();w>arr.size()/2;w--){
                    int q = (int) arr.get(w);
                    if(p+q==4){
                        arr.set(z,0);
                        arr.set(w,0);
                        count+=1;
                        z-=1;
                        w+=1;
                    }
                }
            }

        for(int y=0;y<arr.size();y++) {
            int o = (int) arr.get(y);
            if(o==0){
                arr.remove(y);
                y -=1;
            }
        }

        System.out.println(arr.toString());
            count+=arr.size();
        System.out.println(count);
            }
        }





