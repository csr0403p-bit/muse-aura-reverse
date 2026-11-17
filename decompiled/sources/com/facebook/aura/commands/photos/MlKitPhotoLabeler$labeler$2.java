package com.facebook.aura.commands.photos;

import X.AbstractC3512CRm;
import X.AbstractC7559F3s;
import X.BV8;
import X.C3104ByR;
import X.C3555CTs;
import X.C3591CWa;
import X.C3695Cct;
import X.C3713CdC;
import X.C3716CdF;
import X.CRy;
import X.CUK;
import X.CVy;
import X.CWZ;
import X.EnumC10421Hbu;
import X.EnumC3721CdK;
import X.InterfaceC3000Brb;
import X.RunnableC3697Ccv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class MlKitPhotoLabeler$labeler$2 extends AbstractC7559F3s implements Function0<InterfaceC3000Brb> {
    public static final MlKitPhotoLabeler$labeler$2 INSTANCE = new MlKitPhotoLabeler$labeler$2();

    public MlKitPhotoLabeler$labeler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC3000Brb invoke() {
        CVy cVy;
        CRy.A08(BV8.A1X(0.5f), "Confidence Threshold should be in range [0.0f, 1.0f].");
        CRy.A08(BV8.A1X(0.6f), "Confidence Threshold should be in range [0.0f, 1.0f].");
        C3104ByR c3104ByR = new C3104ByR();
        synchronized (CVy.class) {
            cVy = (CVy) C3555CTs.A00().A02(CVy.class);
        }
        Object obj = cVy.A00.get(c3104ByR.getClass());
        CRy.A03(obj);
        C3591CWa c3591CWa = (C3591CWa) ((CUK) obj).get();
        C3695Cct c3695Cct = c3591CWa.A00;
        C3713CdC c3713CdC = new C3713CdC();
        c3713CdC.A01 = EnumC3721CdK.TYPE_THIN;
        RunnableC3697Ccv.A00(EnumC10421Hbu.A2k, new C3716CdF(c3713CdC, 1), c3695Cct);
        return new CWZ(AbstractSafeParcelable.A03("vision.ica", 1L), (AbstractC3512CRm) c3591CWa.A02.A00(c3104ByR), (Executor) c3591CWa.A01.A00.get());
    }
}
