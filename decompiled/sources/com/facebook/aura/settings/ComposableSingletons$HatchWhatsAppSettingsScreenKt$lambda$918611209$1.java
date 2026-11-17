package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C1SA;
import X.G0V;
import android.content.res.Resources;
import com.facebook.aura.R;
import java.io.IOException;
import kotlin.Unit;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.facebook.aura.settings.ComposableSingletons$HatchWhatsAppSettingsScreenKt$lambda$-918611209$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchWhatsAppSettingsScreenKt$lambda$918611209$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchWhatsAppSettingsScreenKt$lambda$918611209$1 INSTANCE = new ComposableSingletons$HatchWhatsAppSettingsScreenKt$lambda$918611209$1();

    public ComposableSingletons$HatchWhatsAppSettingsScreenKt$lambda$918611209$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            C1SA.A02(bfm, BRg.A00, AbstractC8407FdO.A00(bfm, R.drawable.ic_channel_whatsapp), 60.0f);
        } else {
            bfm.Afo();
        }
    }
}
