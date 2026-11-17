package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import android.content.res.Resources;
import com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey;
import com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt;
import java.io.IOException;
import kotlin.Unit;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SpacesModalEntryProviderKt$lambda$-1320076236$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SpacesModalEntryProviderKt$lambda$1320076236$1 extends AbstractC7559F3s implements G0W<PeerSpaceMenuSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpacesModalEntryProviderKt$lambda$1320076236$1 INSTANCE = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$1320076236$1();

    public ComposableSingletons$SpacesModalEntryProviderKt$lambda$1320076236$1() {
        super(3);
    }

    public final void invoke(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        PeerSpaceMenuSheetKt.PeerSpaceMenuSheet(peerSpaceMenuSheetKey, null, bfm, AnonymousClass006.A0E(peerSpaceMenuSheetKey, i), 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
        invoke(peerSpaceMenuSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
