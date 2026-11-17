package X;

import android.app.Dialog;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BUa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2326BUa extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;

    public static final void A00(AT3 at3, AaJ aaJ, float f, long j, long j2) {
        at3.A9N(null, aaJ, f, 1.0f, 3, j, AWx.A05(at3.ADU(), j2));
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        long jA05 = AWx.A05(at3.ADU(), j2);
        float fA03 = AnonymousClass003.A03(jA05);
        float f2 = fA03 - (0.25f * f);
        float fA00 = AnonymousClass004.A00(jA05);
        float f3 = 0.35f * f;
        Path path = c1710AotA00.A03;
        path.moveTo(f2, fA00 - f3);
        path.lineTo(fA03 + (0.45f * f), fA00);
        path.lineTo(f2, fA00 + f3);
        path.close();
        at3.A9d(null, c1710AotA00, C16a.A00, 1.0f, 3, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2326BUa(Object obj, int i) {
        super(1);
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Path path;
        Function0<Unit> function0;
        Rect rect;
        AaC aaCA02;
        AndroidComposeView androidComposeView;
        switch (this.$t) {
            case 0:
                AnX anX = (AnX) obj;
                AbstractC1633An8 abstractC1633An8 = (AbstractC1633An8) anX;
                InputConnection inputConnection = abstractC1633An8.A00;
                if (inputConnection != null) {
                    inputConnection.closeConnection();
                    abstractC1633An8.A00 = null;
                }
                Am4 am4 = (Am4) this.A00;
                C0910AHm<C1431Aj0<AnX>> c0910AHm = am4.A00;
                C1431Aj0<AnX>[] c1431Aj0Arr = c0910AHm.A01;
                int i = c0910AHm.A00;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        if (!C7384Etj.areEqual(c1431Aj0Arr[i2], anX)) {
                            i2++;
                        } else if (i2 >= 0) {
                            c0910AHm.A07(i2);
                        }
                    }
                }
                if (c0910AHm.A00 == 0) {
                    function0 = am4.A04;
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC1564Ale.A06((InterfaceC0857A6e) obj, ((C1YD) this.A00).A00);
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj;
                Object objInvoke = ((Function0) this.A00).invoke();
                if (objInvoke != null) {
                    list.add(objInvoke);
                    return Boolean.valueOf(z);
                }
                return Boolean.valueOf(z);
            case 3:
                ((C1453AjM) this.A00).A0Z((AXN) obj);
                return Unit.INSTANCE;
            case 4:
                InterfaceC1464AjX interfaceC1464AjX = (InterfaceC1464AjX) obj;
                if (AbstractC1512AkJ.A00 && ((ViewGroup) this.A00).hasFocus()) {
                    ((AndroidComposeView) interfaceC1464AjX).A0h.A6G(true);
                }
                if ((interfaceC1464AjX instanceof AndroidComposeView) && (androidComposeView = (AndroidComposeView) interfaceC1464AjX) != null) {
                    View view = (View) this.A00;
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(view);
                    C0862A6j.A01(androidComposeView.getAndroidViewsHandler$ui().A01).remove(androidComposeView.getAndroidViewsHandler$ui().A00.remove(view));
                    view.setImportantForAccessibility(0);
                }
                ((ViewGroup) this.A00).removeAllViewsInLayout();
                return Unit.INSTANCE;
            case 5:
                ((C1634An9) this.A00).A07 = (G0U) obj;
                return Unit.INSTANCE;
            case 6:
                AbstractC1439Aj8 abstractC1439Aj8 = (AbstractC1439Aj8) this.A00;
                if (abstractC1439Aj8.isAttached) {
                    AnonymousClass001.A1J(BU6.A0M(abstractC1439Aj8, obj, null, 42), abstractC1439Aj8.getCoroutineScope());
                }
                return Unit.INSTANCE;
            case 7:
                InterfaceC1535Akr interfaceC1535Akr = (InterfaceC1535Akr) obj;
                AbstractC1439Aj8 abstractC1439Aj82 = (AbstractC1439Aj8) this.A00;
                View viewA00 = AkV.A00(abstractC1439Aj82);
                if (!viewA00.isFocused() && !viewA00.hasFocus()) {
                    InterfaceC1536Aks interfaceC1536AksA01 = AbstractC1414Aij.A01(abstractC1439Aj82);
                    View viewA002 = AbstractC1329AhG.A00(abstractC1439Aj82);
                    C1528Akh c1528Akh = (C1528Akh) interfaceC1535Akr;
                    Integer numA02 = AbstractC1579Alu.A02(c1528Akh.A01);
                    int[] iArr = new int[2];
                    viewA002.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewA00.getLocationOnScreen(iArr2);
                    C1506AkD c1506AkDA00 = AbstractC1485Ajs.A00(((C1517AkR) interfaceC1536AksA01).A01);
                    if (c1506AkDA00 == null || (aaCA02 = AbstractC1485Ajs.A02(c1506AkDA00)) == null) {
                        rect = null;
                    } else {
                        int i3 = (int) aaCA02.A01;
                        int i4 = iArr[0];
                        int i5 = iArr2[0];
                        int i6 = (int) aaCA02.A03;
                        int i7 = iArr[1];
                        int i8 = iArr2[1];
                        rect = new Rect((i3 + i4) - i5, (i6 + i7) - i8, (((int) aaCA02.A02) + i4) - i5, (((int) aaCA02.A00) + i7) - i8);
                    }
                    if (!AbstractC1579Alu.A03(rect, viewA00, numA02)) {
                        c1528Akh.A00 = true;
                    }
                }
                return Unit.INSTANCE;
            case 8:
                View viewA003 = AkV.A00((AbstractC1439Aj8) this.A00);
                if (AbstractC1512AkJ.A00 && (viewA003.hasFocus() || viewA003.isFocused())) {
                    viewA003.clearFocus();
                }
                return Unit.INSTANCE;
            case 9:
                Dialog dialog = (Dialog) this.A00;
                dialog.show();
                return new BSM(dialog, 13);
            case 10:
                InterfaceC1497Ak4 interfaceC1497Ak4AIa = ((InterfaceC1497Ak4) obj).AIa();
                C7384Etj.A0X(interfaceC1497Ak4AIa);
                ((C1711Aou) this.A00).A0H(interfaceC1497Ak4AIa);
                return Unit.INSTANCE;
            case 11:
                long j = ((BL4) obj).A00;
                C1711Aou c1711Aou = (C1711Aou) this.A00;
                c1711Aou.m17setPopupContentSizefhxjrPA(BL4.A00(j));
                c1711Aou.A0G();
                return Unit.INSTANCE;
            case 12:
                AYU.A04((AYU) obj, (AZE) this.A00, 0, 0);
                return Unit.INSTANCE;
            case 13:
                AYU ayu = (AYU) obj;
                List list2 = (List) this.A00;
                int iA0E = AnonymousClass002.A0E(list2);
                if (iA0E >= 0) {
                    int i9 = 0;
                    while (true) {
                        AYU.A04(ayu, (AZE) list2.get(i9), 0, 0);
                        if (i9 != iA0E) {
                            i9++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 14:
                BA0 ba0 = (BA0) this.A00;
                if (ba0.A00.A02) {
                    function0 = ba0.A01;
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 15:
                final Function0 function02 = (Function0) obj;
                View view2 = (View) this.A00;
                Handler handler = view2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function02.invoke();
                } else {
                    Handler handler2 = view2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new Runnable() { // from class: X.Aox
                            public static final String __redex_internal_original_name = "PopupLayout$snapshotStateObserver$1$$ExternalSyntheticLambda0";

                            @Override // java.lang.Runnable
                            public final void run() {
                                function02.invoke();
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            case 16:
            case 17:
            default:
                Reference reference = (Reference) obj;
                C7384Etj.A0Y(reference, 0);
                Object obj2 = reference.get();
                boolean z = obj2 == null || obj2 == this.A00;
                return Boolean.valueOf(z);
            case 18:
                int iA0F = AnonymousClass001.A0F(obj);
                Object objA0A = AbstractC0878AGe.A0A(iA0F, (List) this.A00);
                return objA0A == null ? Integer.valueOf(iA0F) : objA0A;
            case 19:
                AYU ayu2 = (AYU) obj;
                C7384Etj.A0Y(ayu2, 0);
                ayu2.A0A((AZE) this.A00, 0.0f, 0, 0);
                return Unit.INSTANCE;
            case 20:
                InterfaceC0857A6e interfaceC0857A6e = (InterfaceC0857A6e) obj;
                C7384Etj.A0Y(interfaceC0857A6e, 0);
                Object obj3 = this.A00;
                C7384Etj.A0Y(obj3, 1);
                interfaceC0857A6e.Aca(C9WU.A01, obj3);
                return Unit.INSTANCE;
            case 21:
                AT3 at3 = (AT3) obj;
                C7384Etj.A0Y(at3, 0);
                C9WB c9wb = (C9WB) this.A00;
                AaJ aaJA00 = AaJ.A00(null, at3.Ah4(c9wb.A05), 0);
                long jAKb = at3.AKb();
                float fMin = Math.min(AnonymousClass003.A03(jAKb), AnonymousClass004.A00(jAKb)) / 2.0f;
                C1780Aqg c1780Aqg = c9wb.A0D;
                if (c1780Aqg != null) {
                    A00(at3, aaJA00, fMin, c1780Aqg.A01, c1780Aqg.A02);
                }
                A00(at3, aaJA00, fMin, c9wb.A0B, 0L);
                return Unit.INSTANCE;
            case 22:
                AT3 at32 = (AT3) obj;
                C7384Etj.A0Y(at32, 0);
                long jAKb2 = at32.AKb();
                float fA03 = AnonymousClass003.A03(jAKb2) / 2.0f;
                float fA00 = AnonymousClass004.A00(jAKb2) / 2.0f;
                float fMin2 = Math.min(fA03, fA00);
                float f = 0.382f * fMin2;
                C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
                int i10 = 0;
                do {
                    float f2 = f;
                    if (i10 % 2 == 0) {
                        f2 = fMin2;
                    }
                    double d = (float) (((i10 * 3.141592653589793d) / 5.0d) - 1.5707963267948966d);
                    float fCos = (((float) Math.cos(d)) * f2) + fA03;
                    float fSin = (f2 * ((float) Math.sin(d))) + fA00;
                    path = c1710AotA00.A03;
                    if (i10 == 0) {
                        path.moveTo(fCos, fSin);
                    } else {
                        path.lineTo(fCos, fSin);
                    }
                    i10++;
                } while (i10 < 10);
                path.close();
                C8j3.A1H(c1710AotA00, at32, ((C9W7) this.A00).A09);
                return Unit.INSTANCE;
            case 23:
                C1958Aux c1958Aux = (C1958Aux) obj;
                C7384Etj.A0Y(c1958Aux, 0);
                AEG aeg = (AEG) this.A00;
                C1956Auv c1956Auv = c1958Aux.A03;
                aeg.A01 = c1956Auv.A07(0);
                aeg.A00 = c1956Auv.A06(0);
                return Unit.INSTANCE;
            case 24:
                InterfaceC0857A6e interfaceC0857A6e2 = (InterfaceC0857A6e) obj;
                C7384Etj.A0Y(interfaceC0857A6e2, 0);
                InterfaceC0857A6e.A01(C9WM.A00, interfaceC0857A6e2, ((C9VX) this.A00).A03);
                return Unit.INSTANCE;
            case 25:
                C2LD c2ld = (C2LD) obj;
                C7384Etj.A0Y(c2ld, 0);
                C1432Aj1 c1432Aj1 = (C1432Aj1) this.A00;
                C1432Aj1.A00(c2ld, c1432Aj1, c1432Aj1.A00);
                return Unit.INSTANCE;
        }
    }
}
