package com.facebook.aura.partners.voice.api;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$downloadPreviewAudio$2$1$closeOnCancellation$1", f = "VoiceCatalogRepository.kt", l = {343}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceCatalogRepository$downloadPreviewAudio$2$1$closeOnCancellation$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchHttpResponseStream $response;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCatalogRepository$downloadPreviewAudio$2$1$closeOnCancellation$1(HatchHttpResponseStream hatchHttpResponseStream, HtJ<? super VoiceCatalogRepository$downloadPreviewAudio$2$1$closeOnCancellation$1> htJ) {
        super(2, htJ);
        this.$response = hatchHttpResponseStream;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceCatalogRepository$downloadPreviewAudio$2$1$closeOnCancellation$1(this.$response, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A02(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        } catch (Throwable th) {
            this.$response.close();
            throw th;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new VoiceCatalogRepository$downloadPreviewAudio$2$1$closeOnCancellation$1(this.$response, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
