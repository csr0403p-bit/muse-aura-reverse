package com.facebook.aura.bloks.host;

import X.AbstractC3358CGz;
import X.AbstractC8571FgQ;
import X.BV4;
import X.C5323DgH;
import X.C60O;
import X.C7384Etj;
import X.C7695FAt;
import X.C7696FAu;
import X.C7697FAv;
import X.C7699FAx;
import X.C8021FPx;
import X.CHA;
import X.F0C;
import X.F8T;
import X.FB0;
import X.FB2;
import X.FBD;
import X.FBN;
import X.FC1;
import X.FC3;
import X.HuA;
import X.InterfaceC7549F2g;
import X.InterfaceC7700FAy;
import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialCarrier;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.bloks.asynccomponent.AuraComponentQueryObjectSet;
import com.facebook.aura.bloks.asynccomponent.AuraComponentQueryStoreProviderImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class AuraBloksHost implements FBD {
    public final AuraBloksConfig mBloksConfig;
    public FragmentActivity mFragmentActivity;
    public AbstractC8571FgQ mFragmentManager;
    public final ConcurrentHashMap<String, Long> mImpressionTimesMap;
    public final HatchPostConsolidationCredentialCarrier mPostConsolidationCredentialCarrier;
    public final C8021FPx mViewpointManager;

    private Context getContext() {
        FragmentActivity fragmentActivity = this.mFragmentActivity;
        if (fragmentActivity == null || fragmentActivity.contextAwareHelper.A01 == null) {
            return null;
        }
        return this.mFragmentActivity.contextAwareHelper.A01;
    }

    public static C7697FAv getUserScopedGlobalStateModule(AbstractC3358CGz abstractC3358CGz) {
        C7697FAv c7697FAv;
        ConcurrentHashMap<Class<?>, F0C<InterfaceC7549F2g>> concurrentHashMap = CHA.A00;
        F0C<InterfaceC7549F2g> f0c = concurrentHashMap.get(FC3.class);
        FC3 fc3 = (FC3) (f0c != null ? f0c.getValue() : null);
        if (fc3 == null) {
            fc3 = new FC3();
            concurrentHashMap.put(FC3.class, new C5323DgH(fc3));
        }
        synchronized (fc3) {
            c7697FAv = fc3.A00;
            if (c7697FAv == null) {
                c7697FAv = new C7697FAv(new C7699FAx());
                fc3.A00 = c7697FAv;
            }
        }
        return c7697FAv;
    }

    public /* bridge */ /* synthetic */ F8T getBloksConfig() {
        return this.mBloksConfig;
    }

    public FragmentActivity getFragmentActivity() {
        return this.mFragmentActivity;
    }

    public AbstractC8571FgQ getFragmentManager() {
        return this.mFragmentManager;
    }

    public ConcurrentHashMap<String, Long> getImpressionTimesMap() {
        return this.mImpressionTimesMap;
    }

    public HatchPostConsolidationCredentialCarrier getPostConsolidationCredentialCarrier() {
        return this.mPostConsolidationCredentialCarrier;
    }

    public AbstractC3358CGz getUserSession() {
        return AuraUserSessionStore.INSTANCE.getCurrentUserSession();
    }

    public C8021FPx getViewpointManager() {
        return this.mViewpointManager;
    }

    public AuraBloksHost(AbstractC8571FgQ abstractC8571FgQ, FragmentActivity fragmentActivity, AuraBloksConfig auraBloksConfig, HatchPostConsolidationCredentialCarrier hatchPostConsolidationCredentialCarrier) {
        this.mFragmentActivity = fragmentActivity;
        this.mFragmentManager = abstractC8571FgQ;
        this.mBloksConfig = auraBloksConfig;
        this.mViewpointManager = new C8021FPx(new HuA(), new FC1());
        this.mImpressionTimesMap = C60O.A1C();
        this.mPostConsolidationCredentialCarrier = hatchPostConsolidationCredentialCarrier;
    }

    private Map<String, InterfaceC7700FAy<?>> createDataModulesMap(FBN fbn) {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("acq", new C7695FAt(fbn));
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        mapA0u.put("gs", currentUserSession == null ? FB2.A00 : getUserScopedGlobalStateModule(currentUserSession));
        mapA0u.put("hot_reload", new FB0());
        mapA0u.put("ls", new C7696FAu());
        return mapA0u;
    }

    @Override // X.FBD
    public SparseArray<Object> createObjectSet() {
        SparseArray<Object> sparseArrayA0B = BV4.A0B();
        FBN auraComponentQueryStoreProviderImpl = AuraComponentQueryStoreProviderImpl.getInstance(AuraComponentQueryObjectSet.INSTANCE.create(getContext()));
        C7384Etj.A0U(auraComponentQueryStoreProviderImpl);
        sparseArrayA0B.put(R.id.bk_context_key_async_component_store, auraComponentQueryStoreProviderImpl);
        sparseArrayA0B.put(R.id.bk_context_key_data_modules, createDataModulesMap(auraComponentQueryStoreProviderImpl));
        return sparseArrayA0B;
    }

    public AuraBloksHost(AbstractC8571FgQ abstractC8571FgQ, FragmentActivity fragmentActivity, AuraBloksConfig auraBloksConfig) {
        this(abstractC8571FgQ, fragmentActivity, auraBloksConfig, null);
    }

    /* renamed from: getBloksConfig, reason: collision with other method in class */
    public AuraBloksConfig m290getBloksConfig() {
        return this.mBloksConfig;
    }
}
