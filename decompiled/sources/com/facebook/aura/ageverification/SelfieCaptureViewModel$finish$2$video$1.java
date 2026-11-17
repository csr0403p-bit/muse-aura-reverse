package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCaptureViewModel$finish$2$video$1", f = "SelfieCaptureViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SelfieCaptureViewModel$finish$2$video$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super CapturedVideo>, Object> {
    public final /* synthetic */ File $videoFile;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCaptureViewModel$finish$2$video$1(File file, HtJ<? super SelfieCaptureViewModel$finish$2$video$1> htJ) {
        super(2, htJ);
        this.$videoFile = file;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelfieCaptureViewModel$finish$2$video$1(this.$videoFile, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super CapturedVideo> htJ) {
        return new SelfieCaptureViewModel$finish$2$video$1(this.$videoFile, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AgeVerificationFiles.INSTANCE.readVideo(this.$videoFile);
    }
}
