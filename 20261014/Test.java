public class Test
{
    public static void main(String[] args)
    {
        class CPU
        {
            int speed;

            void setSpeed(int speed)
            {
                this.speed=speed;
            }
            int getSpeed()
            {
                return speed;
            }
        }

        class HardDisk
        {
            int amount;
            void setAmount(int amount)
            {
                this.amount=amount;
            }
            int getAmount()
            {
                return amount;
            }
        }

        class PC
        {
            CPU processor;
            HardDisk hDisk;

            void setCPU(CPU paraCpu)
            {
                processor=paraCpu;
            }
            void setHardDisk(HardDisk paraDisk)
            {
                hDisk=paraDisk;
            }
            void show()
            {
                System.out.println(processor.speed);
                System.out.println(hDisk.amount);
            }
        }

        CPU cpu = new CPU();
        cpu.speed=2200;
        HardDisk hdisk = new HardDisk();
        hdisk.amount=200;

        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(hdisk);
        pc.show();
    }    
}
