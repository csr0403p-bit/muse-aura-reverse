package X;

/* loaded from: classes5.dex */
public abstract class EPR {
    public static final EPM A01(EPL epl) {
        if (epl != null) {
            switch (epl.ordinal()) {
                case 0:
                    return EPM.A05;
                case 1:
                    return EPM.A06;
                case 2:
                    return EPM.A08;
                case 3:
                    return EPM.A09;
                case 4:
                    return EPM.A07;
                case 5:
                    return EPM.A0D;
                case 6:
                    return EPM.A0E;
                case 7:
                    return EPM.A0F;
                case 8:
                    return EPM.A0M;
                case 9:
                    return EPM.A0I;
                case 10:
                    return EPM.A0G;
                case 11:
                    return EPM.A0H;
                case 12:
                    return EPM.A0L;
                case 14:
                    return EPM.A0J;
                case 15:
                    return EPM.A0K;
                case 16:
                    return EPM.A0O;
                case 17:
                    return EPM.A0P;
                case 18:
                    return EPM.A02;
                case 19:
                    return EPM.A03;
                case 20:
                    return EPM.A0A;
                case 21:
                    return EPM.A0B;
                case 22:
                    return EPM.A0C;
                case 23:
                    return EPM.A04;
                case 24:
                    return EPM.A0Q;
            }
        }
        return EPM.A0N;
    }

    public static final Integer A00(EPM epm) {
        switch (epm.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                return C79.A01;
            case 2:
                return C79.A0C;
            case 5:
            case 6:
                return C79.A0K;
            case 7:
                return C79.A0P;
            case 8:
                return C79.A00;
            case 9:
                return C79.A0W;
            case 10:
            case 11:
                return C79.A0T;
            case 12:
                return C79.A0Y;
            case 13:
            case 14:
                return C79.A04;
            case 15:
            case 16:
                return C79.A0Z;
            case 17:
            case 18:
                return C79.A0c;
            case 19:
            case 20:
            case 21:
                return C79.A02;
            case 22:
                return C79.A03;
            case 23:
                return C79.A05;
            default:
                return C79.A06;
        }
    }
}
