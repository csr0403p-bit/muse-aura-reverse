package X;

import java.text.BreakIterator;
import org.maplibre.android.R;

/* renamed from: X.Ecm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6936Ecm implements C7Jh {
    public static IllegalArgumentException A00(String str, int i, int i2) {
        return new IllegalArgumentException(FGI.A0V(str, new String(new int[]{i}, 0, 1), " at string index ", i2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:246:0x04ae
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:389:0x00d5 A[EDGE_INSN: B:389:0x00d5->B:50:0x00d5 BREAK  A[LOOP:0: B:28:0x00a1->B:395:0x00a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    @Override // X.C7Jh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Ac0(java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6936Ecm.Ac0(java.lang.String):java.lang.String");
    }

    public static boolean A02(int i) {
        if (i < 48) {
            return false;
        }
        if (i <= 57) {
            return true;
        }
        if (i < 65) {
            return false;
        }
        if (i > 70) {
            return i >= 97 && i <= 102;
        }
        return true;
    }

    public static boolean A03(int i) {
        if (i == 33 || i == 36 || i == 59 || i == 61) {
            return true;
        }
        switch (i) {
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
            case 40:
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
            case 42:
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
            case 44:
                return true;
            default:
                return false;
        }
    }

    public static boolean A04(int i) {
        int i2;
        boolean z;
        if (i >= 65) {
            if (i > 90) {
                if (i >= 97) {
                    i2 = 122;
                    if (i <= i2) {
                    }
                }
                z = false;
            }
            z = true;
        } else {
            if (i >= 48) {
                i2 = 57;
                if (i <= i2) {
                    z = true;
                }
            }
            z = false;
        }
        return z || i == 45 || i == 46 || i == 95 || i == 126;
    }

    public static void A01(String str, BreakIterator breakIterator) {
        int length = str.length();
        int iCurrent = breakIterator.current();
        if (iCurrent >= length || iCurrent == -1) {
            throw C60O.A0i("Hex string must have 2 characters, found 0");
        }
        int iCodePointAt = str.codePointAt(iCurrent);
        if (!A02(iCodePointAt)) {
            throw C60Q.A0V("First hex string character ", new String(new int[]{iCodePointAt}, 0, 1), " is not a valid hex digit");
        }
        int next = breakIterator.next();
        if (next >= length || next == -1) {
            throw C60O.A0i("Hex string must have 2 characters, found 1");
        }
        int iCodePointAt2 = str.codePointAt(next);
        if (!A02(iCodePointAt2)) {
            throw C60Q.A0V("Second hex string character ", new String(new int[]{iCodePointAt2}, 0, 1), " is not a valid hex digit");
        }
    }
}
