package com.facebook.aura.bloks.activity;

import X.AbstractC8276Fb0;
import X.AbstractC8330Fbx;
import X.AnonymousClass003;
import X.BV4;
import X.BV6;
import X.C3cG;
import X.C60O;
import X.C7344EnG;
import X.C7384Etj;
import X.C7933FLf;
import X.C7958FMo;
import X.C8573FgU;
import X.CFK;
import X.EnumC7948FMe;
import X.F60;
import X.FHL;
import X.FMd;
import X.FN4;
import X.FND;
import X.FOO;
import X.Hi4;
import X.HiC;
import X.HiZ;
import X.RunnableC7961FMr;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bloks.foa.screenqueries.screencontainer.ScreenPropInitException;
import com.facebook.aura.R;
import com.facebook.aura.bloks.screen.AuraAppScreenConfig;
import com.facebook.aura.bloks.ui.AuraCdsBottomSheetFragment;
import com.instagram.common.bloks.BloksParseResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AuraCDSBloksActivity extends AppCompatActivity {

    public final class IntentBuilder {
        public int appScreenConfig;
        public int backButtonOverride;
        public String bloksAppId;
        public Map<String, String> bloksParams;
        public String bloksScreenId;
        public final Context context;
        public int keyboardSoftInputMode;

        public IntentBuilder(Context context) {
            C7384Etj.A0Y(context, 0);
            this.context = context;
        }

        public final IntentBuilder setBloksAppId(String str) {
            C7384Etj.A0Y(str, 0);
            this.bloksAppId = str;
            return this;
        }

        public final IntentBuilder setBloksParams(Map<String, String> map) {
            C7384Etj.A0Y(map, 0);
            this.bloksParams = map;
            return this;
        }

        public final IntentBuilder setBloksScreenId(String str) {
            C7384Etj.A0Y(str, 0);
            this.bloksScreenId = str;
            return this;
        }

        public final Intent build() {
            Intent intent = new Intent(this.context, (Class<?>) AuraCDSBloksActivity.class);
            intent.putExtra("cds_platform", "Bloks");
            String str = this.bloksAppId;
            if (str == null) {
                C7384Etj.A0b("bloksAppId");
                throw F60.createAndThrow();
            }
            intent.putExtra(CDSBloksConstants.BLOKS_APP_ID, str);
            String str2 = this.bloksScreenId;
            if (str2 == null) {
                C7384Etj.A0b("bloksScreenId");
                throw F60.createAndThrow();
            }
            intent.putExtra(CDSBloksConstants.BLOKS_SCREEN_ID, str2);
            intent.putExtra(CDSBloksConstants.BLOKS_APP_SCREEN_CONFIG, this.appScreenConfig);
            Map<String, String> map = this.bloksParams;
            if (map == null) {
                C7384Etj.A0b("bloksParams");
                throw F60.createAndThrow();
            }
            intent.putExtra(CDSBloksConstants.BLOKS_PARAMS, BV4.A0w(map));
            intent.putExtra(CDSBloksConstants.BLOKS_KEYBOARD_SOFT_INPUT_MODE, this.keyboardSoftInputMode);
            intent.putExtra("disable_edge_to_edge_system_bars_views", true);
            intent.putExtra(MwaCDSBloksConstans.KEY_BACK_BUTTON_OVERRIDE, this.backButtonOverride);
            return intent;
        }

        public final IntentBuilder setAppScreenConfig(int i) {
            this.appScreenConfig = i;
            return this;
        }

        public final IntentBuilder setBackButtonOverride(int i) {
            this.backButtonOverride = i;
            return this;
        }

        public final IntentBuilder setKeyboardSoftInputMode(int i) {
            this.keyboardSoftInputMode = i;
            return this;
        }
    }

    private final void openBloksScreenQuery(C7933FLf c7933FLf) {
        FMd fMdA00;
        if (getIntent().getBooleanExtra("disable_edge_to_edge_system_bars_views", false)) {
            findViewById(R.id.bloks_container).setFitsSystemWindows(false);
        }
        FHL fhl = c7933FLf.A02;
        if (!(fhl instanceof FMd) || (fMdA00 = (FMd) fhl) == null) {
            fMdA00 = FMd.A00(EnumC7948FMe.A03, fhl != null ? fhl.AK5() : 0);
        }
        AuraCdsBottomSheetFragment.Companion companion = AuraCdsBottomSheetFragment.Companion;
        String str = c7933FLf.A07;
        AuraCdsBottomSheetFragment auraCdsBottomSheetFragmentNewInstance = companion.newInstance(str, fMdA00.A01());
        String str2 = c7933FLf.A08;
        navigateTo(auraCdsBottomSheetFragmentNewInstance, str, str2);
        Integer num = fMdA00.A0H;
        C7958FMo c7958FMo = new C7958FMo(null, fMdA00.A0G, num != null ? num.intValue() : 32);
        AuraAppScreenConfig.Builder builder = new AuraAppScreenConfig.Builder();
        builder.cdsOpenScreenConfig = fMdA00;
        BloksParseResult bloksParseResult = c7933FLf.A03;
        builder.actionLoadingScreen = bloksParseResult;
        HiZ.A00(C60O.A02(), auraCdsBottomSheetFragmentNewInstance, new RunnableC7961FMr(auraCdsBottomSheetFragmentNewInstance, this, c7933FLf, bloksParseResult, new AuraAppScreenConfig(builder), c7958FMo, str2));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FND.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void openBloksScreenController() {
        String stringExtra = getIntent().getStringExtra(CDSBloksConstants.BLOKS_APP_ID);
        if (stringExtra == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        String stringExtra2 = getIntent().getStringExtra(CDSBloksConstants.BLOKS_SCREEN_ID);
        if (stringExtra2 == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        int intExtra = getIntent().getIntExtra(CDSBloksConstants.BLOKS_KEYBOARD_SOFT_INPUT_MODE, 0);
        AuraAppScreenConfig appScreenConfig = getAppScreenConfig();
        Serializable serializableExtra = getIntent().getSerializableExtra(CDSBloksConstants.BLOKS_PARAMS);
        C7384Etj.A0Z(serializableExtra, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        HashMap map = (HashMap) serializableExtra;
        if (getIntent().getBooleanExtra("disable_edge_to_edge_system_bars_views", false)) {
            findViewById(R.id.bloks_container).setFitsSystemWindows(false);
        }
        AuraCdsBottomSheetFragment auraCdsBottomSheetFragmentNewInstance = AuraCdsBottomSheetFragment.Companion.newInstance(stringExtra, appScreenConfig.builder.cdsOpenScreenConfig.A01());
        FN4 fn4 = new FN4(null, stringExtra, map, C3cG.A0h(), null, null, null, 0);
        navigateTo(auraCdsBottomSheetFragmentNewInstance, stringExtra, stringExtra2);
        HiZ.A00(C60O.A02(), auraCdsBottomSheetFragmentNewInstance, new RunnableC7961FMr(auraCdsBottomSheetFragmentNewInstance, this, fn4, appScreenConfig.builder.actionLoadingScreen, appScreenConfig, new C7958FMo(getBackButtonOverride(), null, intExtra), stringExtra2));
    }

    private final void openNative() {
        AuraCdsBottomSheetFragment.Companion companion = AuraCdsBottomSheetFragment.Companion;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = BV6.A0N();
        }
        AuraCdsBottomSheetFragment auraCdsBottomSheetFragmentNewInstance = companion.newInstance(extras, FND.A03);
        if (getIntent().getBooleanExtra("disable_edge_to_edge_system_bars_views", false)) {
            findViewById(R.id.bloks_container).setFitsSystemWindows(false);
        }
        navigateTo(auraCdsBottomSheetFragmentNewInstance, null, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> listA02 = HiC.A02(HiC.A00(this));
        AuraCdsBottomSheetFragment auraCdsBottomSheetFragment = (AuraCdsBottomSheetFragment) ((listA02 == null || listA02.isEmpty()) ? null : HiC.A01(HiC.A00, AuraCdsBottomSheetFragment.class, listA02));
        if (auraCdsBottomSheetFragment != null) {
            auraCdsBottomSheetFragment.onBackPress();
        } else {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws ScreenPropInitException {
        FND fndValueOf;
        Map map;
        super.onCreate(bundle);
        AbstractC8276Fb0 abstractC8276Fb0A03 = AppCompatActivity.A03(this);
        if (abstractC8276Fb0A03 != null) {
            abstractC8276Fb0A03.A03();
        }
        setContentView(R.layout._name_removed__res_0x7f0d001b);
        if (bundle == null) {
            try {
                Intent intent = getIntent();
                C7384Etj.A0U(intent);
                String stringExtra = intent.getStringExtra("cds_platform");
                if (stringExtra == null || (fndValueOf = FND.valueOf(stringExtra)) == null) {
                    throw C3cG.A0Q("Platform is missing from the bundle. Please check that 'cds_platform' field is set.");
                }
                int iOrdinal = fndValueOf.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    openNative();
                    return;
                }
                Bundle bundleExtra = getIntent().getBundleExtra("screen_query_props_bundle");
                if (bundleExtra == null) {
                    openBloksScreenController();
                    return;
                }
                try {
                    Bundle bundle2 = bundleExtra.getBundle("key_screen_container_props_bundle");
                    if (bundle2 != null) {
                        boolean z = bundle2.getBoolean("key_from_config_change");
                        Integer numValueOf = Integer.valueOf(bundle2.getInt("key_content_parse_result"));
                        BloksParseResult bloksParseResult = (BloksParseResult) Hi4.A01(BloksParseResult.class, numValueOf);
                        if (bloksParseResult != null) {
                            Integer numValueOf2 = Integer.valueOf(bundle2.getInt("key_tree_params"));
                            Object objA01 = Hi4.A01(Map.class, numValueOf2);
                            if ((objA01 instanceof Map) && (map = (Map) objA01) != null) {
                                String string = bundle2.getString("key_analytics_module");
                                Integer numValueOf3 = Integer.valueOf(bundle2.getInt("key_analytics_extras"));
                                Map map2 = (Map) Hi4.A01(Map.class, numValueOf3);
                                boolean z2 = bundle2.getBoolean("key_animate_on_navigation");
                                Integer numValueOf4 = Integer.valueOf(bundle2.getInt("key_container_config"));
                                openBloksScreenQuery(new C7933FLf((FHL) Hi4.A01(FHL.class, numValueOf4), bloksParseResult, Boolean.valueOf(z2), string, Arrays.asList(numValueOf, numValueOf2, numValueOf3, numValueOf4), map, map2, true, z));
                                return;
                            }
                        }
                    }
                    throw C3cG.A0Q("args Bundle must contain ScreenContainerProps");
                } catch (RuntimeException e) {
                    throw new ScreenPropInitException(e);
                }
            } catch (IllegalStateException e2) {
                CFK.A0A(AuraCDSBloksActivityKt.TAG, "Launched without a CDS platform", e2);
                finish();
            }
        }
    }

    private final AuraAppScreenConfig getAppScreenConfig() {
        AuraAppScreenConfig auraAppScreenConfig = (AuraAppScreenConfig) Hi4.A01(AuraAppScreenConfig.class, Integer.valueOf(getIntent().getIntExtra(CDSBloksConstants.BLOKS_APP_SCREEN_CONFIG, 0)));
        return auraAppScreenConfig == null ? new AuraAppScreenConfig(new AuraAppScreenConfig.Builder()) : auraAppScreenConfig;
    }

    private final FOO getBackButtonOverride() {
        FOO foo = (FOO) Hi4.A01(FOO.class, Integer.valueOf(getIntent().getIntExtra(MwaCDSBloksConstans.KEY_BACK_BUTTON_OVERRIDE, 0)));
        if (foo == null) {
            return null;
        }
        return foo;
    }

    private final void navigateTo(Fragment fragment, String str, String str2) {
        C8573FgU c8573FgU = new C8573FgU(AbstractC8330Fbx.A00(this));
        List<Fragment> listA03 = AbstractC8330Fbx.A00(this).A0U.A03();
        C7384Etj.A0U(listA03);
        if (listA03.isEmpty()) {
            c8573FgU.A01(fragment, str, R.id.bloks_container, 2);
        } else {
            c8573FgU.A01(fragment, null, R.id.bloks_container, 1);
        }
        c8573FgU.A03(false, true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AnonymousClass003.A0v(str, printWriter);
        if (C7344EnG.A05(printWriter, str, strArr)) {
            return;
        }
        super.dump(str, fileDescriptor, printWriter, strArr);
    }
}
