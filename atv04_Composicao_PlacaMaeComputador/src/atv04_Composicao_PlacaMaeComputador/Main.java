package atv04_Composicao_PlacaMaeComputador;

public class Main {
    public static void main(String[] args) {

                Computador pc = new Computador(
                        "Dell",
                        "Inspiron 15",
                        "Intel Core i5",
                        8,
                        "ASUS",
                        "B560",
                        4,
                        "DDR4"
                );

                System.out.println("=== ESTADO INICIAL ===");
                pc.exibirComputadorCompleto();

                System.out.println("\n=== ATUALIZAÇÕES ===\n");

                pc.setProcessador("Intel Core i7");
                pc.setMemoriaRam(pc.getMemoriaRam() + 8);
                pc.getPlacaMae().setChipset("Z590");
                pc.getPlacaMae().setTipoDeMemoriaSuportada("DDR5");

                System.out.println("\n=== ESTADO FINAL ===");
                pc.exibirComputadorCompleto();
            }
        }


