package com.facebook.aura.settings.importmemory;

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

/* renamed from: com.facebook.aura.settings.importmemory.ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$-2098414365$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$2098414365$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$2098414365$1 INSTANCE = new ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$2098414365$1();

    public ComposableSingletons$HatchImportMemoryToHatchScreenKt$lambda$2098414365$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AnonymousClass007.A0z(bfm, BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_checkmark_circle_outline_24, 0), AuraIconSize.SMALL, C06G.A0D(bfm));
        } else {
            bfm.Afo();
        }
    }
}
