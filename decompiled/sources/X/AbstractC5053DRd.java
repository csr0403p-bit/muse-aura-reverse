package X;

import android.content.res.Resources;
import com.facebook.mobileconfig.factory.MobileConfigUnsafeContext;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.DRd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5053DRd<UnitType> implements InterfaceC5054DRe<UnitType>, MobileConfigUnsafeContext {
    public final /* synthetic */ InterfaceC5054DRe<UnitType> $$delegate_0;
    public final DSU impl;

    public AbstractC5053DRd(DSU dsu) {
        C7384Etj.A0Y(dsu, 0);
        this.$$delegate_0 = dsu;
        this.impl = dsu;
    }

    public static InterfaceC5054DRe A00(AbstractC5053DRd abstractC5053DRd, Object obj) {
        C7384Etj.A0Y(obj, 0);
        return abstractC5053DRd.$$delegate_0;
    }

    @Override // X.InterfaceC5054DRe
    public void addChangeListener(DSh dSh) {
        C7384Etj.A0Y(dSh, 0);
        this.impl.addChangeListener(dSh);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public boolean getBooleanWithOptions(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        return this.impl.getBooleanWithOptions(j, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public double getDoubleWithOptions(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        return this.impl.getDoubleWithOptions(j, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public long getLongWithOptions(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        return this.impl.getLongWithOptions(j, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public String getStringWithOptions(long j, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 1);
        String stringWithOptions = this.impl.getStringWithOptions(j, c4992DKo);
        C7384Etj.A0U(stringWithOptions);
        return stringWithOptions;
    }

    @Override // X.InterfaceC5054DRe
    public Map<Integer, Integer> getEmergencyPushInfo() {
        return this.impl.getEmergencyPushInfo();
    }

    public final DSU getImpl() {
        return this.impl;
    }

    @Override // X.InterfaceC5054DRe
    public boolean isAdvancedConsistencyLoggingEnabled(long j) {
        return this.$$delegate_0.isAdvancedConsistencyLoggingEnabled(j);
    }

    @Override // X.InterfaceC5054DRe
    public boolean getBoolean(C7491Exw<Boolean, ? extends UnitType> c7491Exw) {
        return A00(this, c7491Exw).getBoolean(c7491Exw);
    }

    @Override // X.InterfaceC5054DRe
    public double getDouble(C7491Exw<Double, ? extends UnitType> c7491Exw) {
        return A00(this, c7491Exw).getDouble(c7491Exw);
    }

    @Override // X.InterfaceC5054DRe
    public long getLong(C7491Exw<Long, ? extends UnitType> c7491Exw) {
        return A00(this, c7491Exw).getLong(c7491Exw);
    }

    @Override // X.InterfaceC5054DRe
    public String getString(C7491Exw<String, ? extends UnitType> c7491Exw) {
        String string = A00(this, c7491Exw).getString(c7491Exw);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // X.InterfaceC5054DRe
    public boolean hasExposure(C7491Exw<?, ? extends UnitType> c7491Exw) {
        return A00(this, c7491Exw).hasExposure(c7491Exw);
    }

    @Override // X.InterfaceC5054DRe
    public void logExposure(C7491Exw<?, ?> c7491Exw) {
        A00(this, c7491Exw).logExposure(c7491Exw);
    }

    @Override // X.InterfaceC5054DRe
    @Deprecated(message = "Deprecated in Java")
    public boolean getBoolean(C7491Exw<Boolean, ? extends UnitType> c7491Exw, boolean z) {
        return A00(this, c7491Exw).getBoolean(c7491Exw, z);
    }

    @Override // X.InterfaceC5054DRe
    @Deprecated(message = "Deprecated in Java")
    public boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends UnitType> c7491Exw, boolean z, C4992DKo c4992DKo) {
        AnonymousClass003.A0v(c7491Exw, c4992DKo);
        return this.$$delegate_0.getBooleanWithOptions(c7491Exw, z, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    @Deprecated(message = "Deprecated in Java")
    public double getDouble(C7491Exw<Double, ? extends UnitType> c7491Exw, double d) {
        return A00(this, c7491Exw).getDouble(c7491Exw, d);
    }

    @Override // X.InterfaceC5054DRe
    @Deprecated(message = "Deprecated in Java")
    public double getDoubleWithOptions(C7491Exw<Double, ? extends UnitType> c7491Exw, double d, C4992DKo c4992DKo) {
        AnonymousClass003.A0v(c7491Exw, c4992DKo);
        return this.$$delegate_0.getDoubleWithOptions(c7491Exw, d, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    @Deprecated(message = "Deprecated in Java")
    public long getLong(C7491Exw<Long, ? extends UnitType> c7491Exw, long j) {
        return A00(this, c7491Exw).getLong(c7491Exw, j);
    }

    @Override // X.InterfaceC5054DRe
    @Deprecated(message = "Deprecated in Java")
    public long getLongWithOptions(C7491Exw<Long, ? extends UnitType> c7491Exw, long j, C4992DKo c4992DKo) {
        AnonymousClass003.A0v(c7491Exw, c4992DKo);
        return this.$$delegate_0.getLongWithOptions(c7491Exw, j, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public String getString(long j, int i, Resources resources) {
        C7384Etj.A0Y(resources, 2);
        String string = this.impl.getString(j, i, resources);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // X.InterfaceC5054DRe
    public String getStringWithOptions(C7491Exw<String, ? extends UnitType> c7491Exw, String str, C4992DKo c4992DKo) {
        AnonymousClass005.A0x(c7491Exw, str, c4992DKo);
        String stringWithOptions = this.$$delegate_0.getStringWithOptions(c7491Exw, str, c4992DKo);
        C7384Etj.A0U(stringWithOptions);
        return stringWithOptions;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public boolean hasExposure(long j) {
        return this.impl.hasExposure(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public void logExposure(long j) {
        this.impl.logExposure(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    @Deprecated(message = "Deprecated in Java")
    public boolean getBoolean(long j, boolean z) {
        return this.impl.getBoolean(j, z);
    }

    @Override // X.InterfaceC5054DRe
    public boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends UnitType> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return this.$$delegate_0.getBooleanWithOptions(c7491Exw, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    @Deprecated(message = "Deprecated in Java")
    public double getDouble(long j, double d) {
        return this.impl.getDouble(j, d);
    }

    @Override // X.InterfaceC5054DRe
    public double getDoubleWithOptions(C7491Exw<Double, ? extends UnitType> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return this.$$delegate_0.getDoubleWithOptions(c7491Exw, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    @Deprecated(message = "Deprecated in Java")
    public long getLong(long j, long j2) {
        return this.impl.getLong(j, j2);
    }

    @Override // X.InterfaceC5054DRe
    public long getLongWithOptions(C7491Exw<Long, ? extends UnitType> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return this.$$delegate_0.getLongWithOptions(c7491Exw, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public String getString(long j, String str) {
        C7384Etj.A0Y(str, 1);
        String string = this.impl.getString(j, str);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public String getStringWithOptions(long j, int i, Resources resources, C4992DKo c4992DKo) {
        AnonymousClass002.A1B(resources, 2, c4992DKo);
        String stringWithOptions = this.impl.getStringWithOptions(j, i, resources, c4992DKo);
        C7384Etj.A0U(stringWithOptions);
        return stringWithOptions;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public boolean getBoolean(long j) {
        return this.impl.getBoolean(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    @Deprecated(message = "Deprecated in Java")
    public boolean getBooleanWithOptions(long j, boolean z, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 2);
        return this.impl.getBooleanWithOptions(j, z, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public double getDouble(long j) {
        return this.impl.getDouble(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    @Deprecated(message = "Deprecated in Java")
    public double getDoubleWithOptions(long j, double d, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 2);
        return this.impl.getDoubleWithOptions(j, d, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public long getLong(long j) {
        return this.impl.getLong(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    @Deprecated(message = "Deprecated in Java")
    public long getLongWithOptions(long j, long j2, C4992DKo c4992DKo) {
        C7384Etj.A0Y(c4992DKo, 2);
        return this.impl.getLongWithOptions(j, j2, c4992DKo);
    }

    @Override // X.InterfaceC5054DRe
    public String getString(C7491Exw<String, ? extends UnitType> c7491Exw, int i, Resources resources) {
        AnonymousClass003.A0v(c7491Exw, resources);
        String string = this.$$delegate_0.getString(c7491Exw, i, resources);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // X.InterfaceC5054DRe
    public String getStringWithOptions(C7491Exw<String, ? extends UnitType> c7491Exw, int i, Resources resources, C4992DKo c4992DKo) {
        AnonymousClass005.A11(c7491Exw, resources, c4992DKo, 0);
        String stringWithOptions = this.$$delegate_0.getStringWithOptions(c7491Exw, i, resources, c4992DKo);
        C7384Etj.A0U(stringWithOptions);
        return stringWithOptions;
    }

    @Override // X.InterfaceC5054DRe
    public String getString(C7491Exw<String, ? extends UnitType> c7491Exw, String str) {
        AnonymousClass003.A0u(c7491Exw, str);
        String string = this.$$delegate_0.getString(c7491Exw, str);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public String getString(long j) {
        String string = this.impl.getString(j);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // X.InterfaceC5054DRe
    public String getStringWithOptions(C7491Exw<String, ? extends UnitType> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        String stringWithOptions = this.$$delegate_0.getStringWithOptions(c7491Exw, c4992DKo);
        C7384Etj.A0U(stringWithOptions);
        return stringWithOptions;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public String getStringWithOptions(long j, String str, C4992DKo c4992DKo) {
        AnonymousClass003.A0x(str, c4992DKo);
        String stringWithOptions = this.impl.getStringWithOptions(j, str, c4992DKo);
        C7384Etj.A0U(stringWithOptions);
        return stringWithOptions;
    }
}
