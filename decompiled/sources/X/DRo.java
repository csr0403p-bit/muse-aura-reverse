package X;

import android.content.res.Resources;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DRo implements DRX {
    @Override // X.InterfaceC5054DRe
    public final double getDouble(C7491Exw<Double, ? extends Object> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return DSC.A00(c7491Exw.A00);
    }

    @Override // X.InterfaceC5054DRe
    public final long getLong(C7491Exw<Long, ? extends Object> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return DSC.A01(c7491Exw.A00);
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return DSC.A02(c7491Exw.A00);
    }

    @Override // X.InterfaceC5054DRe
    public final void logExposure(C7491Exw<?, ?> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBoolean(long j) {
        return AnonymousClass002.A1M((((j >>> 61) & 1) > 1L ? 1 : (((j >>> 61) & 1) == 1L ? 0 : -1)));
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBooleanWithOptions(long j, C4992DKo c4992DKo) {
        return AnonymousClass002.A1M((((j >>> 61) & 1) > 1L ? 1 : (((j >>> 61) & 1) == 1L ? 0 : -1)));
    }

    @Override // X.InterfaceC5054DRe
    public final void addChangeListener(DSh dSh) {
    }

    @Override // X.InterfaceC5054DRe
    public final double getDoubleWithOptions(C7491Exw<Double, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return DSC.A00(c7491Exw.A00);
    }

    @Override // X.InterfaceC5054DRe
    public final Map<Integer, Integer> getEmergencyPushInfo() {
        return BV4.A0u();
    }

    @Override // X.InterfaceC5054DRe
    public final long getLongWithOptions(C7491Exw<Long, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return DSC.A01(c7491Exw.A00);
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return DSC.A02(c7491Exw.A00);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean hasExposure(long j) {
        return false;
    }

    @Override // X.InterfaceC5054DRe
    public final boolean isAdvancedConsistencyLoggingEnabled(long j) {
        return false;
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBoolean(C7491Exw<Boolean, ? extends Object> c7491Exw, boolean z) {
        C7384Etj.A0Y(c7491Exw, 0);
        return z;
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends Object> c7491Exw, boolean z, C4992DKo c4992DKo) {
        AnonymousClass003.A0v(c7491Exw, c4992DKo);
        return z;
    }

    @Override // X.InterfaceC5054DRe
    public final double getDouble(C7491Exw<Double, ? extends Object> c7491Exw, double d) {
        C7384Etj.A0Y(c7491Exw, 0);
        return d;
    }

    @Override // X.InterfaceC5054DRe
    public final double getDoubleWithOptions(C7491Exw<Double, ? extends Object> c7491Exw, double d, C4992DKo c4992DKo) {
        AnonymousClass003.A0v(c7491Exw, c4992DKo);
        return d;
    }

    @Override // X.InterfaceC5054DRe
    public final long getLong(C7491Exw<Long, ? extends Object> c7491Exw, long j) {
        C7384Etj.A0Y(c7491Exw, 0);
        return j;
    }

    @Override // X.InterfaceC5054DRe
    public final long getLongWithOptions(C7491Exw<Long, ? extends Object> c7491Exw, long j, C4992DKo c4992DKo) {
        AnonymousClass003.A0v(c7491Exw, c4992DKo);
        return j;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j, int i, Resources resources) throws Resources.NotFoundException {
        C7384Etj.A0Y(resources, 2);
        String string = resources.getString(i);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getStringWithOptions(long j, String str, C4992DKo c4992DKo) {
        C7384Etj.A0Y(str, 1);
        return str;
    }

    @Override // X.InterfaceC5054DRe
    public final boolean hasExposure(C7491Exw<?, ? extends Object> c7491Exw) {
        return false;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final void logExposure(long j) {
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBooleanWithOptions(C7491Exw<Boolean, ? extends Object> c7491Exw, C4992DKo c4992DKo) {
        AnonymousClass003.A0u(c7491Exw, c4992DKo);
        return getBooleanWithOptions(c7491Exw.A00, c4992DKo);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDoubleWithOptions(long j, C4992DKo c4992DKo) {
        return DSC.A00(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLongWithOptions(long j, C4992DKo c4992DKo) {
        return DSC.A01(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j, String str) {
        C7384Etj.A0Y(str, 1);
        return str;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getStringWithOptions(long j, int i, Resources resources, C4992DKo c4992DKo) throws Resources.NotFoundException {
        C7384Etj.A0Y(resources, 2);
        String string = resources.getString(i);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBoolean(long j, boolean z) {
        return z;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDouble(long j, double d) {
        return d;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLong(long j, long j2) {
        return j2;
    }

    @Override // X.InterfaceC5054DRe
    public final boolean getBoolean(C7491Exw<Boolean, ? extends Object> c7491Exw) {
        C7384Etj.A0Y(c7491Exw, 0);
        return getBoolean(c7491Exw.A00);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDouble(long j) {
        return DSC.A00(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLong(long j) {
        return DSC.A01(j);
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw, int i, Resources resources) throws Resources.NotFoundException {
        AnonymousClass003.A0v(c7491Exw, resources);
        String string = resources.getString(i);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, int i, Resources resources, C4992DKo c4992DKo) throws Resources.NotFoundException {
        AnonymousClass005.A11(c7491Exw, resources, c4992DKo, 0);
        String string = resources.getString(i);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final boolean getBooleanWithOptions(long j, boolean z, C4992DKo c4992DKo) {
        return z;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final double getDoubleWithOptions(long j, double d, C4992DKo c4992DKo) {
        return d;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final long getLongWithOptions(long j, long j2, C4992DKo c4992DKo) {
        return j2;
    }

    @Override // X.InterfaceC5054DRe
    public final String getString(C7491Exw<String, ? extends Object> c7491Exw, String str) {
        AnonymousClass003.A0u(c7491Exw, str);
        return str;
    }

    @Override // X.InterfaceC5054DRe
    public final String getStringWithOptions(C7491Exw<String, ? extends Object> c7491Exw, String str, C4992DKo c4992DKo) {
        AnonymousClass005.A0x(c7491Exw, str, c4992DKo);
        return str;
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getString(long j) {
        return DSC.A02(j);
    }

    @Override // com.facebook.mobileconfig.factory.MobileConfigUnsafeContext
    public final String getStringWithOptions(long j, C4992DKo c4992DKo) {
        return DSC.A02(j);
    }
}
