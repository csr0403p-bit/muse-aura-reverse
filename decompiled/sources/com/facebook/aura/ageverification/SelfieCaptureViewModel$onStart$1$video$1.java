package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.bugreport.AuraBugReportSender;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel$onStart$1$video$1", f = "SelfieCaptureViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SelfieCaptureViewModel$onStart$1$video$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super File>, Object> {
    public int label;
    public final /* synthetic */ SelfieCaptureViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCaptureViewModel$onStart$1$video$1(SelfieCaptureViewModel selfieCaptureViewModel, HtJ<? super SelfieCaptureViewModel$onStart$1$video$1> htJ) {
        super(2, htJ);
        this.this$0 = selfieCaptureViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelfieCaptureViewModel$onStart$1$video$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super File> htJ) {
        return new SelfieCaptureViewModel$onStart$1$video$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        AgeVerificationFiles ageVerificationFiles = AgeVerificationFiles.INSTANCE;
        SelfieCaptureViewModel selfieCaptureViewModel = this.this$0;
        return ageVerificationFiles.create(selfieCaptureViewModel.context, selfieCaptureViewModel.userId, "selfie_", AuraBugReportSender.DEFAULT_VIDEO_EXTENSION);
    }
}
