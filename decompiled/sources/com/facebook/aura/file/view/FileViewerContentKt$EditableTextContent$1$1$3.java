package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C06G;
import X.C10G;
import X.G0V;
import com.facebook.aura.markdown.render.AuraMarkdownTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FileViewerContentKt$EditableTextContent$1$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerContentKt$EditableTextContent$1$1$3(String str) {
        super(2);
        this.$content = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(this.$content, C10G.A02, C06G.A0T(bfm), false, null, null, null, null, null, false, false, null, bfm, 48, 0, 4088);
        } else {
            bfm.Afo();
        }
    }
}
