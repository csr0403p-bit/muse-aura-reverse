package com.facebook.aura.file.view;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.BS0;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;

/* loaded from: classes.dex */
public final class LibraryUploadMenuKt$LibraryUploadMenu$1$4 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public final /* synthetic */ AVy $uploadCameraRollIcon;
    public final /* synthetic */ String $uploadCameraRollLabel;
    public final /* synthetic */ AVy $uploadFileIcon;
    public final /* synthetic */ String $uploadFileLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUploadMenuKt$LibraryUploadMenu$1$4(String str, AVy aVy, String str2, AVy aVy2) {
        super(2);
        this.$uploadFileLabel = str;
        this.$uploadFileIcon = aVy;
        this.$uploadCameraRollLabel = str2;
        this.$uploadCameraRollIcon = aVy2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-374178375);
        String str = this.$uploadFileLabel;
        AVy aVy = this.$uploadFileIcon;
        BS0 bs0 = BRg.A00;
        AHH ahhA0E = AGI.A0E(new AuraContextMenuItem(0, str, null, aVy, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(1, this.$uploadCameraRollLabel, null, this.$uploadCameraRollIcon, null, null, false, false, false, true, false, bs0, 1, 1));
        AnonymousClass001.A1D(bfm);
        return ahhA0E;
    }
}
