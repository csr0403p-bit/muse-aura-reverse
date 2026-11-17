package com.facebook.aura.bloks.data;

import X.AbstractC7725FCb;
import X.AbstractC7972FNn;
import X.AnonymousClass003;
import X.BV6;
import X.BV7;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C7973FNo;
import X.C7974FNp;
import X.C7975FNq;
import X.C7979FNv;
import X.FNN;
import X.FO9;
import X.HandlerC7978FNu;
import X.Hi0;
import X.Hod;
import X.Huk;
import X.RunnableC7981FNy;
import android.content.Context;
import android.os.Bundle;
import com.facebook.aura.bloks.data.AuraBloksDataEmitter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AuraBloksDataProps extends Hi0 {
    public static final String APP_ID = "appId";
    public static final Companion Companion = new Companion();
    public static final String LOADED_SCREEN_QUERY = "loaded_screen_query";
    public static final String PARAMS = "params";
    public String appId;
    public Map<String, String> params;

    public final class AuraBloksDataFetch extends FNN<Huk> {
        public final C7979FNv dataContext;
        public final AuraBloksDataProps props;

        @Override // X.FNN
        public AbstractC7972FNn getData() {
            C7979FNv c7979FNv = this.dataContext;
            Context context = c7979FNv.A00;
            AuraBloksDataProps auraBloksDataProps = this.props;
            AuraBloksDataEmitter auraBloksDataEmitter = new AuraBloksDataEmitter(new AuraBloksDataEmitter.Config(context, auraBloksDataProps.appId, auraBloksDataProps.params));
            C7974FNp<Response, Config> c7974FNp = new C7974FNp<>(auraBloksDataEmitter, new HandlerC7978FNu(AbstractC7725FCb.A01));
            auraBloksDataEmitter.mEmitter = c7974FNp;
            C7973FNo c7973FNo = new C7973FNo(c7979FNv, new C7975FNq(), c7974FNp);
            FO9 fo9 = c7974FNp.A02;
            if (fo9.AOp()) {
                C7974FNp.A00(c7973FNo, c7974FNp);
                return c7973FNo;
            }
            fo9.AYE(new RunnableC7981FNy(c7973FNo, c7974FNp));
            return c7973FNo;
        }

        public AuraBloksDataFetch(C7979FNv c7979FNv, AuraBloksDataProps auraBloksDataProps) {
            AnonymousClass003.A0u(c7979FNv, auraBloksDataProps);
            this.dataContext = c7979FNv;
            this.props = auraBloksDataProps;
        }

        public /* bridge */ Object clone() {
            return super.clone();
        }
    }

    public final class Builder extends Hod<Builder> {
        public final Context context;
        public final AuraBloksDataProps props;

        public final Builder appId(String str) {
            C7384Etj.A0Y(str, 0);
            this.props.appId = str;
            return this;
        }

        public final Builder params(Map<String, String> map) {
            C7384Etj.A0Y(map, 0);
            this.props.params = map;
            return this;
        }

        @Override // X.Hod
        public Hi0 build() {
            return this.props;
        }

        @Override // X.Hod
        public /* bridge */ /* synthetic */ Hod getThis() {
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Context context, AuraBloksDataProps auraBloksDataProps) {
            super(context, auraBloksDataProps);
            AnonymousClass003.A0u(context, auraBloksDataProps);
            this.context = context;
            this.props = auraBloksDataProps;
        }

        @Override // X.Hod
        public Builder getThis() {
            return this;
        }
    }

    @Override // X.Hi0
    public <T> FNN<T> toDataFetch(C7979FNv c7979FNv) {
        C7384Etj.A0Y(c7979FNv, 0);
        return new AuraBloksDataFetch(c7979FNv, this);
    }

    public final class Companion {
        public final Builder create(Context context) {
            C7384Etj.A0Y(context, 0);
            return new Builder(context, new AuraBloksDataProps());
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public AuraBloksDataProps() {
        super("AuraBloksDataProps");
        this.appId = "";
        this.params = C3cG.A0j();
    }

    @Override // X.Hi0
    public long getDataPropsHashCode() {
        return BV7.A0D(this.appId, this.params);
    }

    public /* bridge */ Object clone() {
        return super.clone();
    }

    @Override // X.Hi0
    public Hi0 fromBundle(Context context, Bundle bundle) {
        AnonymousClass003.A0u(context, bundle);
        Builder builderCreate = Companion.create(context);
        String string = bundle.getString(APP_ID, "");
        C7384Etj.A0U(string);
        builderCreate.appId(string);
        Serializable serializable = bundle.getSerializable(PARAMS);
        C7384Etj.A0Z(serializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        builderCreate.params((HashMap) serializable);
        return builderCreate.props;
    }

    @Override // X.Hi0
    public Bundle toBundle() {
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putString(APP_ID, this.appId);
        Map<String, String> map = this.params;
        C7384Etj.A0Z(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        bundleA0N.putSerializable(PARAMS, (HashMap) map);
        return bundleA0N;
    }
}
