package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $deviceLabel;
    public final /* synthetic */ NodeListEntry $hatchLinkDevice;
    public final /* synthetic */ String $lastSeenText;
    public final /* synthetic */ String $naText;
    public final /* synthetic */ String $osText;
    public final /* synthetic */ boolean $showOs;

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $deviceLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$deviceLabel = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchDeviceDetailsScreenKt.HatchSettingsValueRow(AbstractC2271BQs.A01(bfm, R.string.device_details_device), this.$deviceLabel, null, null, bfm, 0, 12);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $lastSeenText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(3);
            this.$lastSeenText = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchDeviceDetailsScreenKt.HatchSettingsValueRow(AbstractC2271BQs.A01(bfm, R.string.device_details_last_seen), this.$lastSeenText, null, null, bfm, 0, 12);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $osText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(3);
            this.$osText = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchDeviceDetailsScreenKt.HatchSettingsValueRow(AbstractC2271BQs.A01(bfm, R.string.device_details_os), this.$osText, null, null, bfm, 0, 12);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$deviceLabel), -458850308);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$lastSeenText), -49824027);
        if (this.$showOs) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass3(this.$osText), 636381761);
        }
        NodeListEntry nodeListEntry = this.$hatchLinkDevice;
        if (nodeListEntry != null) {
            String str = this.$naText;
            String str2 = nodeListEntry.networkSsid;
            if (str2 != null) {
                AnonymousClass005.A0u(hatchSectionScope, new HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1$4$1$1(str2), -1612766323);
            }
            AnonymousClass005.A0u(hatchSectionScope, new HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1$4$2(nodeListEntry, str), -1903814993);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1(boolean z, NodeListEntry nodeListEntry, String str, String str2, String str3, String str4) {
        super(1);
        this.$showOs = z;
        this.$hatchLinkDevice = nodeListEntry;
        this.$deviceLabel = str;
        this.$lastSeenText = str2;
        this.$osText = str3;
        this.$naText = str4;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
