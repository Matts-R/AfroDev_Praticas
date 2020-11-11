package Dia7.ThreadsExample;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author matheus
 */

/*Usar Atomics, nesse caso AtomicInteger, permite que Threads acesse o mesmo dado,
nunca ao mesmo tempo claro, semelhante aos Locks que "organizam" o acesso, porém 
bloqueam ou suspendem o processamento das outras Threads. Os elementos da classe 
Atomic não suspendem ou bloqueiam as Threads que não acessam ainda o dado, o que 
melhora a performance.
 */
public class UsingAtomics implements Runnable {

    private static AtomicInteger inteiroAtomico = new AtomicInteger();

    @Override
    public void run() {
        do {
            System.out.println(Thread.currentThread().getName() + " count: "
                    + inteiroAtomico.incrementAndGet());
        } while (inteiroAtomico.get() < 11);
    }

    public static void main(String[] args) {

        new Thread(new UsingAtomics()).start();
        new Thread(new UsingAtomics()).start();
    }
}
