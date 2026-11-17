package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class BUU extends AbstractC7559F3s implements G0U {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUU(int i) {
        super(1);
        this.$t = i;
    }

    public static BUU A00(BFM bfm, int i) {
        BUU buu = new BUU(i);
        bfm.Ai0(buu);
        return buu;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        boolean zA00;
        C1115Aae c1115Aae;
        Float fValueOf;
        int i2;
        switch (this.$t) {
            case 0:
                zA00 = AG3.A00(obj);
                return Boolean.valueOf(zA00);
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 16:
            case 18:
            case 24:
            case 26:
            case 28:
            case 31:
            case 32:
                return Unit.INSTANCE;
            case 2:
            case 15:
                ((Number) obj).longValue();
                return Unit.INSTANCE;
            case 3:
                i = ((Am3) obj).A00;
                return Integer.valueOf(i);
            case 4:
                BLU blu = ((Am3) obj).A03;
                i = blu.A00 - blu.A03;
                return Integer.valueOf(i);
            case 11:
                C1634An9 c1634An9 = (C1634An9) obj;
                Handler handler = c1634An9.getHandler();
                final Function0<Unit> function0 = c1634An9.A0M;
                handler.post(new Runnable() { // from class: X.AnG
                    public static final String __redex_internal_original_name = "AndroidViewHolder$Companion$OnCommitAffectingUpdate$1$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        function0.invoke();
                    }
                });
                return Unit.INSTANCE;
            case 17:
                C0920AHw<Unit> c0920AHw = AbstractC1671Anw.A0L;
                Unit unit = Unit.INSTANCE;
                ((InterfaceC0857A6e) obj).Aca(c0920AHw, unit);
                return unit;
            case 19:
                C1711Aou c1711Aou = (C1711Aou) obj;
                if (c1711Aou.isAttachedToWindow()) {
                    c1711Aou.A0G();
                }
                return Unit.INSTANCE;
            case 20:
                Uri uri = Uri.parse(C8j3.A13(obj));
                C7384Etj.A0U(uri);
                return uri;
            case 21:
                Throwable th = (Throwable) obj;
                C7384Etj.A0Y(th, 0);
                CFK.A08("BaseMapFancyPins", "FancyPins teardown failed", th);
                return Unit.INSTANCE;
            case 22:
                Context context = (Context) obj;
                C7384Etj.A0Y(context, 0);
                return new ALA(context);
            case 23:
                ALA ala = (ALA) obj;
                C7384Etj.A0Y(ala, 0);
                ALK alk = ala.A02;
                AFR afr = alk != null ? alk.A01 : null;
                ALA.A01(ala);
                ala.A02 = null;
                if (afr != null) {
                    ALG.A00(afr, ala);
                }
                return Unit.INSTANCE;
            case 25:
                zA00 = true;
                return Boolean.valueOf(zA00);
            case 27:
                zA00 = false;
                return Boolean.valueOf(zA00);
            case 29:
            case 30:
            case 36:
                AnonymousClass006.A19((InterfaceC0857A6e) obj);
                return Unit.INSTANCE;
            case 33:
                InterfaceC0857A6e interfaceC0857A6e = (InterfaceC0857A6e) obj;
                C7384Etj.A0Y(interfaceC0857A6e, 0);
                interfaceC0857A6e.Aca(AbstractC1671Anw.A0a, "place_header_title_placeholder");
                return Unit.INSTANCE;
            case 34:
                C9Vk c9Vk = (C9Vk) obj;
                C7384Etj.A0Y(c9Vk, 0);
                i = c9Vk.A00;
                return Integer.valueOf(i);
            case 35:
                C9Vk c9Vk2 = (C9Vk) obj;
                C7384Etj.A0Y(c9Vk2, 0);
                Integer num = c9Vk2.A01;
                if (num != null) {
                    return num;
                }
                i = Integer.MAX_VALUE;
                return Integer.valueOf(i);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                C08039sm c08039sm = (C08039sm) obj;
                C7384Etj.A0Y(c08039sm, 0);
                c08039sm.A0C = true;
                return Unit.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                c1115Aae = (C1115Aae) obj;
                C7384Etj.A0Y(c1115Aae, 0);
                c1115Aae.A00 = 1332;
                c1115Aae.A00(AnonymousClass005.A0a(), 0).A00 = AbstractC1045ASp.A00;
                fValueOf = Float.valueOf(290.0f);
                i2 = 666;
                c1115Aae.A00(fValueOf, i2);
                return Unit.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                c1115Aae = (C1115Aae) obj;
                C7384Etj.A0Y(c1115Aae, 0);
                c1115Aae.A00 = 1332;
                c1115Aae.A00(AnonymousClass005.A0a(), 666).A00 = AbstractC1045ASp.A00;
                fValueOf = Float.valueOf(290.0f);
                i2 = c1115Aae.A00;
                c1115Aae.A00(fValueOf, i2);
                return Unit.INSTANCE;
            default:
                return null;
        }
    }
}
