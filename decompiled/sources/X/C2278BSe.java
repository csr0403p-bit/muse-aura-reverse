package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import org.maplibre.android.R;

/* renamed from: X.BSe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2278BSe implements Ht9, G0U {
    public final int $t;

    public C2278BSe(int i) {
        this.$t = i;
    }

    public static C2278BSe A00(int i) {
        return new C2278BSe(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                Resources resources = (Resources) obj;
                C7384Etj.A0Y(resources, 0);
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                for (Context baseContext = (Context) AKO.A08(AndroidCompositionLocals_androidKt.A01, (C0967AJu) ((AKR) obj)); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        return baseContext;
                    }
                }
                return null;
            case 2:
            case 23:
            case 35:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
            case 40:
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
            case 48:
                return Unit.INSTANCE;
            case 3:
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj;
                long j = seekableTransitionState.A02;
                BBO bbo = seekableTransitionState.A05;
                if (bbo != null) {
                    bbo.A03(seekableTransitionState, seekableTransitionState.A0D, AOR.A00);
                }
                long j2 = seekableTransitionState.A02;
                if (j != j2) {
                    AOV aov = seekableTransitionState.A03;
                    if (aov != null) {
                        if (aov.A03 > j2) {
                            SeekableTransitionState.A05(seekableTransitionState);
                        } else {
                            aov.A02 = j2;
                            if (aov.A06 == null) {
                                aov.A01 = Ab3.A03((1.0d - aov.A05.A00) * j2);
                            }
                        }
                    } else if (j2 != 0) {
                        SeekableTransitionState.A07(seekableTransitionState);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                return AOW.A00(AnonymousClass001.A02(obj));
            case 5:
                return AOW.A00(AnonymousClass001.A0F(obj));
            case 6:
                return Integer.valueOf((int) ((AOW) obj).A00);
            case 7:
                return AOW.A00(((C1DG) obj).A00);
            case 8:
                return C8j3.A0k(((AOW) obj).A00);
            case 9:
                long j3 = ((AVe) obj).A00;
                return new ARY(AnonymousClass003.A03(j3), AnonymousClass004.A00(j3));
            case 10:
                ARY ary = (ARY) obj;
                return new AVe(AnonymousClass007.A0A(ary.A00, ary.A01));
            case 11:
                long j4 = ((AWA) obj).A00;
                return new ARY(AnonymousClass003.A03(j4), AnonymousClass004.A00(j4));
            case 12:
                ARY ary2 = (ARY) obj;
                return new AWA(AnonymousClass007.A0A(ary2.A00, ary2.A01));
            case 13:
                long j5 = ((AWx) obj).A00;
                return new ARY(AnonymousClass003.A03(j5), AnonymousClass004.A00(j5));
            case 14:
                ARY ary3 = (ARY) obj;
                return AWx.A0B(AnonymousClass007.A0A(ary3.A00, ary3.A01));
            case 15:
                long j6 = ((C2ae) obj).A00;
                return new ARY(C8j3.A0G(j6), AnonymousClass002.A09(j6));
            case 16:
                ARY ary4 = (ARY) obj;
                return C8j3.A0l(AnonymousClass007.A0C(Math.round(ary4.A00), Math.round(ary4.A01)));
            case 17:
                long j7 = ((BL4) obj).A00;
                return new ARY(C8j3.A0G(j7), AnonymousClass002.A09(j7));
            case 18:
                ARY ary5 = (ARY) obj;
                int iRound = Math.round(ary5.A00);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(ary5.A01);
                return BL4.A00(C8j3.A0T(iRound, iRound2 >= 0 ? iRound2 : 0));
            case 19:
                AaC aaC = (AaC) obj;
                float f = aaC.A01;
                float f2 = aaC.A03;
                float f3 = aaC.A02;
                float f4 = aaC.A00;
                AT9 at9 = new AT9();
                at9.A00 = f;
                at9.A01 = f2;
                at9.A02 = f3;
                at9.A03 = f4;
                return at9;
            case 20:
                AT9 at92 = (AT9) obj;
                return C8j3.A0f(at92.A00, at92.A01, at92.A02, at92.A03);
            case 21:
                return Float.valueOf(((AOW) obj).A00);
            case 22:
                ((C16Z) obj).A9O();
                return Unit.INSTANCE;
            case 24:
                C8kA c8kA = C8kA.$redex_init_class;
                C0967AJu c0967AJu = (C0967AJu) ((AKR) obj);
                Context context = (Context) AKO.A08(AndroidCompositionLocals_androidKt.A01, c0967AJu);
                AXN axn = (AXN) AKO.A08(Am0.A04, c0967AJu);
                BLX blx = (BLX) AKO.A08(BO3.A00, c0967AJu);
                if (blx != null) {
                    return new C0975AKo(context, blx.A01, axn, blx.A00);
                }
                return null;
            case 25:
                AbstractC1564Ale.A01(C2Cx.A03, (InterfaceC0857A6e) obj);
                return Unit.INSTANCE;
            case 26:
                return new C1110AYw(AnonymousClass001.A0F(obj));
            case 27:
            case 29:
            case 31:
            case 33:
            case 36:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return AnonymousClass001.A0i();
            case 28:
                float fA02 = AnonymousClass001.A02(obj);
                AOc<Float> aOc = Aa1.A00;
                return Float.valueOf(fA02 / 2.0f);
            case 30:
                return Float.valueOf(Float.NaN);
            case 32:
                return !((Context) AKO.A08(AndroidCompositionLocals_androidKt.A01, (C0967AJu) ((AKR) obj))).getPackageManager().hasSystemFeature("android.software.leanback") ? C3MX.A01 : AbstractC1280AgQ.A00;
            case 34:
                C1312Agx c1312Agx = (C1312Agx) obj;
                return C3cG.A0P(c1312Agx == null ? false : AnonymousClass002.A1Q(c1312Agx.A00, 2));
            case 42:
                return ((C1743Apg) obj).A0E;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return ((C1743Apg) obj).A05;
            case 44:
                return ((C1743Apg) obj).A02;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return ((C1743Apg) obj).A04;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                List list = (List) obj;
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                return new LazyListState(C8j4.A0H(list, 0), C8j4.A0H(list, 1));
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                List list2 = (List) obj;
                AFs<LazyGridState, ?> aFs2 = LazyGridState.A0O;
                return new LazyGridState(new AdE(2), C8j4.A0H(list2, 0), C8j4.A0H(list2, 1));
            default:
                return null;
        }
    }
}
