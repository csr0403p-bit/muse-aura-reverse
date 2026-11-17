package androidx.compose.ui.contentcapture;

import X.Ab0;
import X.Ab2;
import X.AbstractC1489Ajw;
import X.AbstractC1571All;
import X.Ao3;
import X.Ao4;
import X.BUT;
import X.C1562Alc;
import X.C1629An1;
import X.C1679AoH;
import X.C1687AoR;
import X.C1HY;
import X.C2336BUk;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.Dg5;
import X.G0V;
import X.GCV;
import X.HzR;
import X.InterfaceC1690AoU;
import android.os.Handler;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AndroidContentCaptureManager implements Dg5, View.OnAttachStateChangeListener {
    public long A00;
    public Ab2<Ao4> A01;
    public InterfaceC1690AoU A02;
    public Ao4 A03;
    public boolean A05;
    public Ab0<C1629An1> A07;
    public Function0<? extends InterfaceC1690AoU> A08;
    public final AndroidComposeView A0A;
    public final Runnable A0B;
    public final List<Ao3> A0C = C3cG.A0h();
    public Integer A04 = C79.A00;
    public boolean A06 = true;
    public final HzR<Unit> A0D = new GCV(1, null);
    public final Handler A09 = C60O.A02();

    public static final void A01(AndroidContentCaptureManager androidContentCaptureManager, Ao4 ao4, C1562Alc c1562Alc) {
        androidContentCaptureManager.A05(c1562Alc, new C2336BUk(0, androidContentCaptureManager, ao4));
        List listA0C = c1562Alc.A0C(false, true);
        int size = listA0C.size();
        for (int i = 0; i < size; i++) {
            C1562Alc c1562Alc2 = (C1562Alc) listA0C.get(i);
            if (androidContentCaptureManager.A06().A05(c1562Alc2.A01)) {
                Ab2<Ao4> ab2 = androidContentCaptureManager.A01;
                if (ab2.A05(c1562Alc2.A01)) {
                    Ao4 ao4A04 = ab2.A04(c1562Alc2.A01);
                    if (ao4A04 == null) {
                        throw C3cG.A0Q("node not present in pruned tree before this change");
                    }
                    A01(androidContentCaptureManager, ao4A04, c1562Alc2);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[PHI: r9
  0x0067: PHI (r9v1 android.view.autofill.AutofillId) = (r9v0 android.view.autofill.AutofillId), (r9v7 android.view.autofill.AutofillId) binds: [B:16:0x0045, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(androidx.compose.ui.contentcapture.AndroidContentCaptureManager r15, X.C1562Alc r16, int r17) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A02(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, X.Alc, int):void");
    }

    private final void A05(C1562Alc c1562Alc, G0V<? super Integer, ? super C1562Alc, Unit> g0v) {
        List listA0C = c1562Alc.A0C(false, true);
        int size = listA0C.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listA0C.get(i2);
            if (A06().A05(((C1562Alc) obj).A01)) {
                g0v.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    @Override // X.Dg5
    public final /* synthetic */ void onCreate(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onDestroy(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onPause(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* synthetic */ void onResume(C1HY c1hy) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    private final void A00() {
        InterfaceC1690AoU interfaceC1690AoU = this.A02;
        if (interfaceC1690AoU != null) {
            List<Ao3> list = this.A0C;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Ao3 ao3 = list.get(i);
                if (ao3.A02.intValue() != 0) {
                    long j = ao3.A00;
                    C1679AoH c1679AoH = (C1679AoH) interfaceC1690AoU;
                    ContentCaptureSession contentCaptureSession = (ContentCaptureSession) c1679AoH.A01;
                    AutofillId autofillIdNewAutofillId = contentCaptureSession.newAutofillId(c1679AoH.A00.getAutofillId(), j);
                    if (autofillIdNewAutofillId != null) {
                        contentCaptureSession.notifyViewDisappeared(autofillIdNewAutofillId);
                    }
                } else {
                    C1687AoR c1687AoR = ao3.A01;
                    if (c1687AoR != null) {
                        ((ContentCaptureSession) ((C1679AoH) interfaceC1690AoU).A01).notifyViewAppeared((ViewStructure) c1687AoR.A00);
                    }
                }
            }
            C1679AoH c1679AoH2 = (C1679AoH) interfaceC1690AoU;
            ((ContentCaptureSession) c1679AoH2.A01).notifyViewsDisappeared(c1679AoH2.A00.getAutofillId(), new long[]{Long.MIN_VALUE});
            list.clear();
        }
    }

    public static final void A03(AndroidContentCaptureManager androidContentCaptureManager, String str, int i) {
        InterfaceC1690AoU interfaceC1690AoU = androidContentCaptureManager.A02;
        if (interfaceC1690AoU != null) {
            C1679AoH c1679AoH = (C1679AoH) interfaceC1690AoU;
            AutofillId autofillIdNewAutofillId = ((ContentCaptureSession) c1679AoH.A01).newAutofillId(c1679AoH.A00.getAutofillId(), i);
            if (autofillIdNewAutofillId == null) {
                throw C3cG.A0Q("Invalid content capture ID");
            }
            ((ContentCaptureSession) ((C1679AoH) interfaceC1690AoU).A01).notifyViewTextChanged(autofillIdNewAutofillId, str);
        }
    }

    private final void A04(C1562Alc c1562Alc) {
        if (this.A02 != null) {
            int i = c1562Alc.A01;
            this.A0C.add(new Ao3(null, C79.A01, i, this.A00));
            List listA0C = c1562Alc.A0C(false, true);
            int size = listA0C.size();
            for (int i2 = 0; i2 < size; i2++) {
                A04((C1562Alc) listA0C.get(i2));
            }
        }
    }

    public final Ab0<C1629An1> A06() {
        if (this.A06) {
            this.A06 = false;
            this.A07 = AbstractC1571All.A00(this.A0A.A11, BUT.A00(17));
            this.A00 = System.currentTimeMillis();
        }
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006e -> B:14:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(X.HtJ<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r3 = 15
            boolean r0 = r8 instanceof X.C2312BTm
            if (r0 == 0) goto L7b
            r4 = r8
            X.BTm r4 = (X.C2312BTm) r4
            int r0 = r4.$t
            if (r0 != r3) goto L7b
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r0 = r4.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L71
            if (r1 == r2) goto L38
            if (r1 != r3) goto L81
            java.lang.Object r6 = r4.A01
            X.GCW r6 = (X.GCW) r6
            X.Hwg.A00(r0)
        L2d:
            r4.A01 = r6
            r4.A00 = r2
            java.lang.Object r0 = r6.A01(r4)
            if (r0 != r5) goto L3f
            return r5
        L38:
            java.lang.Object r6 = r4.A01
            X.GCW r6 = (X.GCW) r6
            X.Hwg.A00(r0)
        L3f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L86
            r6.A00()
            X.AoU r0 = r7.A02
            if (r0 == 0) goto L51
            r7.A00()
        L51:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.A0A
            android.os.Handler r1 = r0.getHandler()
            boolean r0 = r7.A05
            if (r0 != 0) goto L64
            if (r1 == 0) goto L64
            r7.A05 = r2
            java.lang.Runnable r0 = r7.A0B
            r1.post(r0)
        L64:
            r0 = 100
            r4.A01 = r6
            r4.A00 = r3
            java.lang.Object r0 = X.C7Bq.A01(r0, r4)
            if (r0 != r5) goto L2d
            return r5
        L71:
            X.Hwg.A00(r0)
            X.HzR<kotlin.Unit> r0 = r7.A0D
            X.GCW r6 = r0.APO()
            goto L2d
        L7b:
            X.BTm r4 = new X.BTm
            r4.<init>(r7, r8, r3)
            goto L18
        L81:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L86:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.A07(X.HtJ):java.lang.Object");
    }

    @Override // X.Dg5
    public final void onStart(C1HY c1hy) {
        this.A02 = this.A08.invoke();
        A02(this, this.A0A.A11.A00(), -1);
        A00();
    }

    @Override // X.Dg5
    public final void onStop(C1HY c1hy) {
        A04(this.A0A.A11.A00());
        A00();
        this.A02 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.A0A.getHandler();
        C7384Etj.A0X(handler);
        handler.removeCallbacks(this.A0B);
        this.A02 = null;
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0<? extends InterfaceC1690AoU> function0) {
        this.A0A = androidComposeView;
        this.A08 = function0;
        Ab2 ab2 = AbstractC1489Ajw.A00;
        this.A07 = ab2;
        this.A01 = Ab2.A01();
        this.A03 = new Ao4(ab2, androidComposeView.A11.A00());
        this.A0B = new Runnable() { // from class: X.Anv
            public static final String __redex_internal_original_name = "AndroidContentCaptureManager$$ExternalSyntheticLambda0";

            /* JADX WARN: Removed duplicated region for block: B:104:0x0232  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0143 A[EDGE_INSN: B:56:0x0143->B:131:0x01c3 BREAK  A[LOOP:4: B:41:0x00f6->B:57:0x0145]] */
            /* JADX WARN: Removed duplicated region for block: B:83:0x01be A[EDGE_INSN: B:83:0x01be->B:134:0x01c3 BREAK  A[LOOP:6: B:61:0x015a->B:84:0x01c0]] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 601
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1670Anv.run():void");
            }
        };
    }
}
