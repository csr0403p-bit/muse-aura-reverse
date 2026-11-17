package com.facebook.aura.spaces.preload;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C07779iq;
import X.C3UX;
import X.C9sU;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.json.HatchJsonKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.preload.SavedSpaceWebSession$admittedUrl$2$frame$1", f = "SavedSpaceWebSession.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SavedSpaceWebSession$admittedUrl$2$frame$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SavedSpaceFrameJson>, Object> {
    public final /* synthetic */ String $encoded;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedSpaceWebSession$admittedUrl$2$frame$1(String str, HtJ<? super SavedSpaceWebSession$admittedUrl$2$frame$1> htJ) {
        super(2, htJ);
        this.$encoded = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SavedSpaceWebSession$admittedUrl$2$frame$1(this.$encoded, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super SavedSpaceFrameJson> htJ) {
        return new SavedSpaceWebSession$admittedUrl$2$frame$1(this.$encoded, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        C9sU c9sU = HatchJsonKt.HatchJson;
        return c9sU.A00((String) c9sU.A00(this.$encoded, C07779iq.A01), SavedSpaceFrameJson$$serializer.INSTANCE);
    }
}
