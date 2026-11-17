package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.BFM;
import X.C0881AGi;
import X.C7384Etj;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.utils.HatchLinkPreviewKt;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HatchMessageLinkPreviewKt {
    public static final List<String> rememberMessageLinkPreviewUrls(HatchMessageUiModel hatchMessageUiModel, BFM bfm, int i) {
        C7384Etj.A0Y(hatchMessageUiModel, 0);
        bfm.AgE(743531389);
        List<String> listRememberLinkPreviewUrls = hatchMessageUiModel.role != HatchMessageRole.USER ? C0881AGi.A00 : HatchLinkPreviewKt.rememberLinkPreviewUrls(hatchMessageUiModel.content, 2, bfm, 48);
        AnonymousClass001.A1D(bfm);
        return listRememberLinkPreviewUrls;
    }
}
