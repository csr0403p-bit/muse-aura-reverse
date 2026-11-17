package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Alq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1575Alq {
    public int A00;
    public final Configuration A01;
    public final View A02;
    public final BBV A03;
    public final MutableState<Configuration> A04;
    public final MutableState<C2K7> A05;
    public final C1404AiZ A06;
    public final C0dx A07;
    public final C1324AhB A08;
    public final ARC A09;
    public final C1858AsV A0A;
    public final C1856AsT A0B;
    public final C9yu A0C;
    public final C2165B0c A0D;
    public final ComponentCallbacks2C1582Alx A0E;
    public final C1584Alz A0F;
    public final C1599AmR A0G;
    public final C1607AmZ A0H;
    public final InterfaceC1651AnU A0I;
    public final C1HY A0J;
    public final BOD A0K;
    public final A6I A0L;
    public final Function0<AnV> A0M;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1575Alq(View view, BBV bbv, C1575Alq c1575Alq, C1HY c1hy, BOD bod, A6I a6i) {
        C1599AmR c1599AmR;
        Configuration configuration;
        MutableState<Configuration> mutableStateA06;
        ARC arc;
        C9yu c9yu;
        C1856AsT c1856AsT;
        C1858AsV c1858AsV;
        InterfaceC1651AnU amK;
        MutableState<C2K7> mutableStateA08;
        C2165B0c c2165B0c;
        Context context = c1575Alq != null ? c1575Alq.A02.getContext() : null;
        final Context context2 = view.getContext();
        boolean zAreEqual = C7384Etj.areEqual(context, context2);
        this.A02 = view;
        this.A03 = bbv;
        this.A0J = c1hy;
        this.A0L = a6i;
        this.A0K = bod;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            c1599AmR = c1575Alq.A0G;
        } else {
            c1599AmR = new C1599AmR();
        }
        this.A0G = c1599AmR;
        this.A0H = c1575Alq != null ? c1575Alq.A0H : new C1607AmZ();
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            configuration = c1575Alq.A01;
        } else {
            configuration = new Configuration(C8j3.A0Z(context2));
        }
        this.A01 = configuration;
        C1325AhC c1325AhC = null;
        boolean z = false;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            mutableStateA06 = c1575Alq.A04;
        } else {
            mutableStateA06 = AbstractC1798ArH.A06(new Configuration(configuration));
        }
        this.A04 = mutableStateA06;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            arc = c1575Alq.A09;
        } else {
            arc = new ARC(context2);
        }
        this.A09 = arc;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            c9yu = c1575Alq.A0C;
        } else {
            c9yu = new C0jP(context2) { // from class: X.9yu
                public final Context A00;

                @Override // X.C0jP
                public final void openUri(String str) {
                    try {
                        this.A00.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    } catch (ActivityNotFoundException e) {
                        throw new IllegalArgumentException(FGI.A0N("Can't open ", str, '.'), e);
                    }
                }

                {
                    this.A00 = context2;
                }
            };
        }
        this.A0C = c9yu;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            c1856AsT = c1575Alq.A0B;
        } else {
            c1856AsT = new C1856AsT(context2);
        }
        this.A0B = c1856AsT;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            c1858AsV = c1575Alq.A0A;
        } else {
            c1858AsV = new C1858AsV(c1856AsT);
        }
        this.A0A = c1858AsV;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            amK = c1575Alq.A0I;
        } else {
            amK = new AmK(context2);
        }
        this.A0I = amK;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            mutableStateA08 = c1575Alq.A05;
        } else {
            mutableStateA08 = C3cG.A08(AG5.A00, new FontFamilyResolverImpl(new AndroidFontLoader(context2), new C1600AmS(Build.VERSION.SDK_INT >= 31 ? AbstractC1603AmV.A00(context2) : 0)));
        }
        this.A05 = mutableStateA08;
        this.A07 = (c1575Alq == null || view != c1575Alq.A02) ? new C1604AmW(view) : c1575Alq.A07;
        if (zAreEqual) {
            C7384Etj.A0X(c1575Alq);
            c2165B0c = c1575Alq.A0D;
        } else {
            c2165B0c = new C2165B0c(ViewConfiguration.get(context2));
        }
        this.A0D = c2165B0c;
        this.A08 = c1575Alq != null ? c1575Alq.A08 : new C1324AhB(c1325AhC, z ? 1 : 0, 1);
        this.A0F = new C1584Alz();
        this.A06 = c1575Alq != null ? c1575Alq.A06 : new C1404AiZ();
        this.A0M = C2328BUc.A00(this, 30);
        this.A0E = new ComponentCallbacks2C1582Alx(this);
    }

    public final void A00() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.A00 = 0;
        } else if (i != 0) {
            return;
        }
        View view = this.A02;
        Context context = view.getContext();
        ComponentCallbacks2C1582Alx componentCallbacks2C1582Alx = this.A0E;
        context.unregisterComponentCallbacks(componentCallbacks2C1582Alx);
        C1584Alz c1584Alz = this.A0F;
        if (c1584Alz.A00 == null) {
            c1584Alz.A01 = null;
        }
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C1582Alx);
    }

    public final void A01() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 1) {
            View view = this.A02;
            Context context = view.getContext();
            ComponentCallbacks2C1582Alx componentCallbacks2C1582Alx = this.A0E;
            context.registerComponentCallbacks(componentCallbacks2C1582Alx);
            A02(view.getResources().getConfiguration());
            C1584Alz c1584Alz = this.A0F;
            MutableState.A09(view.hasWindowFocus(), c1584Alz.A02);
            Function0<AnV> function0 = this.A0M;
            MutableState<AnV> mutableState = c1584Alz.A00;
            if (mutableState == null) {
                c1584Alz.A01 = function0;
            } else {
                mutableState.Af8(function0.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C1582Alx);
        }
    }

    public final void A02(Configuration configuration) {
        int iUpdateFrom = this.A01.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator itA0i = C3cG.A0i(this.A0G.A00);
            while (itA0i.hasNext()) {
                Hoy hoy = (Hoy) ((Reference) ((Map.Entry) itA0i.next()).getValue()).get();
                if (hoy == null || Configuration.needNewResources(iUpdateFrom, hoy.A00)) {
                    itA0i.remove();
                }
            }
            this.A04.Af8(new Configuration(configuration));
            this.A0H.A00();
            if ((268435456 & iUpdateFrom) != 0) {
                MutableState<C2K7> mutableState = this.A05;
                Context context = this.A02.getContext();
                mutableState.Af8(new FontFamilyResolverImpl(new AndroidFontLoader(context), new C1600AmS(Build.VERSION.SDK_INT >= 31 ? AbstractC1603AmV.A00(context) : 0)));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                C1584Alz c1584Alz = this.A0F;
                Function0<AnV> function0 = this.A0M;
                MutableState<AnV> mutableState2 = c1584Alz.A00;
                if (mutableState2 != null) {
                    mutableState2.Af8(function0.invoke());
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/ui/platform/AndroidComposeView;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.BFM r21, androidx.compose.ui.platform.AndroidComposeView r22, X.G0V r23, int r24) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1575Alq.A03(X.BFM, androidx.compose.ui.platform.AndroidComposeView, X.G0V, int):void");
    }
}
