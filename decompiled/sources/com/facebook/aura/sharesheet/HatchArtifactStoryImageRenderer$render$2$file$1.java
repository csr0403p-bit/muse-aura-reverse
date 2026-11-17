package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchArtifactStoryImageRenderer$render$2$file$1 extends AbstractC7559F3s implements G0U<OutputStream, Unit> {
    public final /* synthetic */ Bitmap $bitmap;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OutputStream outputStream) throws IOException {
        C7384Etj.A0Y(outputStream, 0);
        if (!this.$bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
            throw new IOException("Failed to encode artifact story image");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchArtifactStoryImageRenderer$render$2$file$1(Bitmap bitmap) {
        super(1);
        this.$bitmap = bitmap;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(OutputStream outputStream) throws IOException {
        invoke2(outputStream);
        return Unit.INSTANCE;
    }
}
