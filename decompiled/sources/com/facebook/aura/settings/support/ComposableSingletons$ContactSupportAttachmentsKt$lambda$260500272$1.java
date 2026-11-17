package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BFM;
import X.BOf;
import X.C06G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* renamed from: com.facebook.aura.settings.support.ComposableSingletons$ContactSupportAttachmentsKt$lambda$-260500272$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ContactSupportAttachmentsKt$lambda$260500272$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$ContactSupportAttachmentsKt$lambda$260500272$1 INSTANCE = new ComposableSingletons$ContactSupportAttachmentsKt$lambda$260500272$1();

    public ComposableSingletons$ContactSupportAttachmentsKt$lambda$260500272$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AnonymousClass007.A0y(bfm, BOf.A00(bfm, R.drawable.hatch_file_types_document_40, 0), AuraIconSize.LARGE, C06G.A08(bfm));
        } else {
            bfm.Afo();
        }
    }
}
