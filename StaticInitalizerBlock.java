
static boolean flag = false;
static int B = 0;
static int H = 0;

static
    {

            Scanner scanner = new Scanner(System.in);
            B = scanner.nextInt();
            H = scanner.nextInt();

            if(B > 0 && H > 0)
            {
            flag = true;

            }else
            {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            }

