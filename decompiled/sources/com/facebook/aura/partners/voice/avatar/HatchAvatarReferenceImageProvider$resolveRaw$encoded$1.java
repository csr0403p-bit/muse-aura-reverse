package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveRaw$encoded$1", f = "HatchAvatarReferenceImageProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAvatarReferenceImageProvider$resolveRaw$encoded$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ String $avatarStillPath;
    public final /* synthetic */ HatchAvatarReferenceImageProvider.OriginalStill $source;
    public int label;
    public final /* synthetic */ HatchAvatarReferenceImageProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarReferenceImageProvider$resolveRaw$encoded$1(HatchAvatarReferenceImageProvider.OriginalStill originalStill, HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, String str, HtJ<? super HatchAvatarReferenceImageProvider$resolveRaw$encoded$1> htJ) {
        super(2, htJ);
        this.$source = originalStill;
        this.this$0 = hatchAvatarReferenceImageProvider;
        this.$avatarStillPath = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAvatarReferenceImageProvider$resolveRaw$encoded$1(this.$source, this.this$0, this.$avatarStillPath, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapDecodeStillForUpload;
        byte[] bArr;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchAvatarReferenceImageProvider.OriginalStill originalStill = this.$source;
        if ((originalStill == null || (bArr = originalStill.bytes) == null || (bitmapDecodeStillForUpload = this.this$0.decodeBytesForUpload(bArr)) == null) && (bitmapDecodeStillForUpload = this.this$0.decodeStillForUpload(this.$avatarStillPath)) == null) {
            return null;
        }
        return this.this$0.encodeStill(bitmapDecodeStillForUpload);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return ((HatchAvatarReferenceImageProvider$resolveRaw$encoded$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
