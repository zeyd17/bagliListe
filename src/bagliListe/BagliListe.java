package bagliListe;

public class BagliListe {

	rehber ilk =null,son = null;
 	 void ekle(int no,String ad) {
 	   rehber kay�t =new rehber(no, ad);
 		 if (ilk==null) {
			ilk=kay�t;
			son=kay�t;//null
			return;
		   }
 		rehber islem =new rehber(no, ad);
 		son.sonraki=kay�t;
 		son=kay�t;
 				
 		//ilk.sonraki=islem;
 	//	ilk.sonraki=null;
	}
     void listele() {
	  rehber islem=ilk;

		while (islem!=null) {
			
			System.out.printf(islem.ad + "  "  + islem.no + "\n");
		islem=islem.sonraki;
		}
		
}
 }
 class rehber{
 	String ad;
 	int no ;
 	rehber sonraki;
 	rehber(int no,String ad){
 		this.ad=ad;
 		this.no=no;
 		//this.sonraki =null;
 	}
 }




