public class PPN {
    public static void main(String[] args) {

        int TotalPembelian = 100000;
        int PPN = ((TotalPembelian * 10) / 100);
        int TotalPembayaran = TotalPembelian + PPN;
        System.out.println("Total Pembelian  = Rp." + TotalPembelian);
        System.out.println("PPN (10%)        = Rp." + PPN);
        System.out.println("------------------------------ + ");
        System.out.println("Total Pembayaran = Rp." + TotalPembayaran);
    }
}
// OUTPUT
// Total Pembelian  = Rp.100000
// PPN (10%)        = Rp.10000
// ------------------------------ +
// Total Pembayaran = Rp.110000

