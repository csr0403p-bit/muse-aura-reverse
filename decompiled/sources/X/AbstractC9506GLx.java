package X;

import com.google.crypto.tink.internal.TinkBugException;

/* renamed from: X.GLx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9506GLx {
    public static final C9483GKz A00;
    public static final C9483GKz A01;
    public static final GL0 A02;
    public static final GL0 A03;
    public static final GM4 A04;
    public static final GM4 A05;
    public static final GMG A06;
    public static final GMC A07;
    public static final GMC A08;
    public static final GMC A09;

    @Deprecated
    public static final GMC A0A;
    public static final GMH A0B;

    static {
        try {
            GMK gmk = GMK.A03;
            A04 = new GM4(gmk, 16);
            try {
                A05 = new GM4(gmk, 32);
                try {
                    C9480GKw c9480GKw = C9480GKw.A03;
                    A02 = new GL0(c9480GKw, 16, 16);
                    try {
                        A03 = new GL0(c9480GKw, 32, 16);
                        try {
                            GL4 gl4 = GL4.A03;
                            C9479GKv c9479GKv = C9479GKv.A03;
                            A00 = GL3.A00(gl4, c9479GKv, 16, 32, 16, 16);
                            try {
                                A01 = GL3.A00(gl4, c9479GKv, 32, 32, 16, 32);
                                A06 = new GMG(GMM.A03);
                                A0B = new GMH(GMO.A03);
                                try {
                                    A08 = new GMC(GMR.A02, 12);
                                    try {
                                        GMR gmr = GMR.A01;
                                        A09 = new GMC(gmr, 12);
                                        try {
                                            GMC gmc = new GMC(gmr, 8);
                                            A07 = gmc;
                                            A0A = gmc;
                                        } catch (Exception e) {
                                            throw new TinkBugException(e);
                                        }
                                    } catch (Exception e2) {
                                        throw new TinkBugException(e2);
                                    }
                                } catch (Exception e3) {
                                    throw new TinkBugException(e3);
                                }
                            } catch (Exception e4) {
                                throw new TinkBugException(e4);
                            }
                        } catch (Exception e5) {
                            throw new TinkBugException(e5);
                        }
                    } catch (Exception e6) {
                        throw new TinkBugException(e6);
                    }
                } catch (Exception e7) {
                    throw new TinkBugException(e7);
                }
            } catch (Exception e8) {
                throw new TinkBugException(e8);
            }
        } catch (Exception e9) {
            throw new TinkBugException(e9);
        }
    }
}
