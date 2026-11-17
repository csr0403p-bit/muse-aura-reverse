package com.facebook.aura.composer.view;

import X.AXN;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.composer.util.FileThumbnailCache;
import com.facebook.aura.composer.util.ThumbnailResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.view.HatchComposerKt$PendingFilePreview$2$1", f = "HatchComposer.kt", l = {1922}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchComposerKt$PendingFilePreview$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ MutableState<ThumbnailResult> $thumbnailResult$delegate;
    public final /* synthetic */ Uri $uri;
    public int I$0;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$PendingFilePreview$2$1(AXN axn, Context context, Uri uri, MutableState<ThumbnailResult> mutableState, HtJ<? super HatchComposerKt$PendingFilePreview$2$1> htJ) {
        super(2, htJ);
        this.$density = axn;
        this.$context = context;
        this.$uri = uri;
        this.$thumbnailResult$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchComposerKt$PendingFilePreview$2$1(this.$density, this.$context, this.$uri, this.$thumbnailResult$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            int iAbr = this.$density.Abr(HatchComposerKt.ATTACHMENT_TILE_SIZE);
            mutableState = this.$thumbnailResult$delegate;
            FileThumbnailCache fileThumbnailCache = FileThumbnailCache.INSTANCE;
            Context context = this.$context;
            Uri uri = this.$uri;
            this.L$0 = mutableState;
            this.I$0 = iAbr;
            this.label = 1;
            obj = fileThumbnailCache.getOrLoad(context, uri, iAbr, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$0;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchComposerKt$PendingFilePreview$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
