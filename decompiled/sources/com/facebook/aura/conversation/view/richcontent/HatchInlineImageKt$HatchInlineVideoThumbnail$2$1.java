package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt$HatchInlineVideoThumbnail$2$1", f = "HatchInlineImage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineVideoThumbnail$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $effectiveDeleted;
    public final /* synthetic */ boolean $isUnavailable;
    public final /* synthetic */ G0U<String, Unit> $onAllThumbnailsFailed;
    public final /* synthetic */ String $videoUrl;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$HatchInlineVideoThumbnail$2$1(boolean z, boolean z2, G0U<? super String, Unit> g0u, String str, HtJ<? super HatchInlineImageKt$HatchInlineVideoThumbnail$2$1> htJ) {
        super(2, htJ);
        this.$isUnavailable = z;
        this.$effectiveDeleted = z2;
        this.$onAllThumbnailsFailed = g0u;
        this.$videoUrl = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchInlineImageKt$HatchInlineVideoThumbnail$2$1(this.$isUnavailable, this.$effectiveDeleted, this.$onAllThumbnailsFailed, this.$videoUrl, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        G0U<String, Unit> g0u;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$isUnavailable && !this.$effectiveDeleted && (g0u = this.$onAllThumbnailsFailed) != null) {
            g0u.invoke(this.$videoUrl);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchInlineImageKt$HatchInlineVideoThumbnail$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
