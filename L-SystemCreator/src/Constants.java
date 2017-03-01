

public class Constants {


	
    static String[] vars = {"X", "Y", "A", "B"};
    static String[] cons = {"+", "-", "R", "L"};
    static String[] axi = {"X"};
    static String[] rules = {"XtoXRYBBBBBBBR", "YtoLAAAAAAAXLY", "Ato-B+A+B-", "Btof+A-B-A+"};
    static String[] numOps = {"A:f", "-:-90", "+:90", "B:f", "R:r", "L:l"}; 
    static int iters = 8;
    static int[] moveTo = {350, 100};
    static int angle = 60;
	
	/*
	static String[] vars = {"M", "N", "O"};
    static String[] cons = {"[", "]", "A"};
    static String[] axi = {"[N]++[N]++[N]++[N]++[N]"};
    static String[] rules = {"MtoOA++PA—-NA[-OA—-MA]++", "Nto+OA–PA[—MA–NA]+", "Oto-MA++NA[+++OA++PA]-", "Pto–OA++++MA[+PA++++NA]–NA"};
    static String[] numOps = {"M:f", "-:-90", "+:90", "N:f", "O:f"}; 
    static int iters = 2;
    static int[] moveTo = {0, 0};
    static int angle = 36;
	*/
    
    public String[][] frac = {vars, cons, axi, rules, numOps};;

	

    //Dragon Curve
    static String[] d_vars = {"X", "Y"};
    static String[] d_cons = {"F", "+", "-"};
    static String[] d_axi = {"FX"};
    static String[] d_rules = {"XtoX+YF+", "Yto-FX-Y"};
    static String[] d_numOps = {"F:f", "-:-90", "+:90"}; 
    static int d_iters = 12;
    static int[] d_moveTo = {0, 0};
    static int d_angle = 90;
    
    static String[][] DragonList = {d_vars, d_cons, d_axi, d_rules, d_numOps};
    // Sierpinski Triangle
    
    static String[] s_vars = {"A", "B"};
    static String[] s_cons = {"+", "-"};
    static String[] s_axi = {"A"};
    static String[] s_rules = {"Ato+B-A-B+", "Bto-A+B+A-"}; 
    static String[] s_numOps = {"+:-90", "-:90", "A:f", "B:f"};
    static int s_iters = 9;
    static int[] s_moveTo = {-200, -200};
    static int s_angle = 60;
    
    static String[][] SierpinskiList = {s_vars, s_cons, s_axi, s_rules, s_numOps};
        
        //Koch Curve
        
    static String[] k_vars = {"F"};
    static String[] k_cons = {"+", "-"};
    static String[] k_axi = {"F"};
    static String[] k_rules = {"FtoF+F-F-F+F"}; // try {"Fto+FF+F-F-F+FF+"};
    static String[] k_numOps = {"F:f", "+:-90", "-:90"};
    static int k_iters = 4;
    static int[] k_moveTo = {-200, 0};
    static int k_angle = 90;
    
    static String[][] KochList = {k_vars, k_cons, k_axi, k_rules, k_numOps};
    
    //Pythagoras Tree
    
    static String[] py_vars = {"0", "1"};
    static String[] py_cons = {"[", "]", "+"};
    static String[] py_axi = {"0"};
    static String[] py_rules = {"1to11", "0to1[0]1[0]0"}; // try {"Fto+FF+F-F-F+FF+"};
    static String[] py_numOps = {"0:f", "1:f", "[:[", "]:]", "+:90"};
    static int py_iters = 7;
    static int[] py_moveTo = {-300, -100};
    static int py_angle = 45/2;
    
    static String[][] PythagorasList = {py_vars, py_cons, py_axi, py_rules, py_numOps};
    
    
    
    //PlantThing
    static String[] p_vars = {"F", "X"};
    static String[] p_cons = {"[", "]", "+", "-"};
    static String[] p_axi = {"X"};
    static String[] p_rules = {"XtoF-[[X]+X]+F[+FX]-X", "FtoFF"}; // try {"Fto+FF+F-F-F+FF+"};
    static String[] p_numOps = {"+:90", "-:-90", "[:[", "]:]", "F:f"};
    static int p_iters = 6;
    static int[] p_moveTo = {-250, -250};
    static int p_angle = 25;
    
    static String[][] PlantList = {p_vars, p_cons, p_axi, p_rules,p_numOps};
    
    
    public Constants(int consFrac){
        if(consFrac == 1){
            frac = DragonList;
            iters = d_iters;
            moveTo = d_moveTo;
            angle = d_angle;
        }
        if(consFrac == 2){
            frac = SierpinskiList;
            iters = s_iters;
            moveTo = s_moveTo;
            angle = s_angle;
        }
        if(consFrac == 3){
            frac = KochList;
            iters = k_iters;
            moveTo = k_moveTo;
            angle = k_angle;
        }
        if(consFrac == 4){
            frac = PlantList;
            iters = p_iters;
            moveTo = p_moveTo;
            angle = p_angle;
        }
        if(consFrac == 5){
            frac = PythagorasList;
            iters = py_iters;
            moveTo = py_moveTo;
            angle = py_angle;
        }
    }
    public Constants(){
    }
}