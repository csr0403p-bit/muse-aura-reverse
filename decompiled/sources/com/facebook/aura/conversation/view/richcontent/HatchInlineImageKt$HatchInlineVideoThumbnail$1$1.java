package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1T;
import X.C3UX;
import X.C78T;
import X.C7Je;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2178B0w;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.components.reactions.AuraLightningLatchKt;
import com.facebook.aura.file.utils.HatchMediaAspectRatios;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt$HatchInlineVideoThumbnail$1$1", f = "HatchInlineImage.kt", l = {AuraLightningLatchKt.LIGHTNING_TOTAL_MS}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineVideoThumbnail$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<InterfaceC2178B0w> $localThumbnail$delegate;
    public final /* synthetic */ String $sharedElementKey;
    public final /* synthetic */ String $videoUrl;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt$HatchInlineVideoThumbnail$1$1$1", f = "HatchInlineImage.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt$HatchInlineVideoThumbnail$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<InterfaceC2178B0w> $localThumbnail$delegate;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ String $videoUrl;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, String str2, MutableState<InterfaceC2178B0w> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$videoUrl = str;
            this.$sharedElementKey = str2;
            this.$localThumbnail$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$videoUrl, this.$sharedElementKey, this.$localThumbnail$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            B1T b1t;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            MutableState<InterfaceC2178B0w> mutableState = this.$localThumbnail$delegate;
            B1T b1t2 = null;
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.$context, C7Je.A01(this.$videoUrl));
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L);
                    if (frameAtTime != null) {
                        HatchMediaAspectRatios.INSTANCE.put(this.$sharedElementKey, frameAtTime.getWidth() / frameAtTime.getHeight());
                        b1t = new B1T(frameAtTime);
                    } else {
                        b1t = null;
                    }
                    mediaMetadataRetriever.release();
                    b1t2 = b1t;
                } catch (Throwable th) {
                    mediaMetadataRetriever.release();
                    throw th;
                }
            } catch (Exception unused) {
            }
            float f = HatchInlineImageKt.DefaultInlineImageSize;
            mutableState.Af8(b1t2);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineImageKt$HatchInlineVideoThumbnail$1$1(Context context, String str, String str2, MutableState<InterfaceC2178B0w> mutableState, HtJ<? super HatchInlineImageKt$HatchInlineVideoThumbnail$1$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$videoUrl = str;
        this.$sharedElementKey = str2;
        this.$localThumbnail$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchInlineImageKt$HatchInlineVideoThumbnail$1$1(this.$context, this.$videoUrl, this.$sharedElementKey, this.$localThumbnail$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$videoUrl, this.$sharedElementKey, this.$localThumbnail$delegate, null);
            this.label = 1;
            if (GAo.A00(this, c78tA0s, anonymousClass1) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchInlineImageKt$HatchInlineVideoThumbnail$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
