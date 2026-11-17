package X;

import com.facebook.aura.graphql.AuraGraphQLExecutorFactory;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.DbK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5177DbK {
    public static final CGM A00() {
        ConcurrentHashMap<String, CGM> concurrentHashMap = DZ8.A00;
        CGM cgm = concurrentHashMap.get(AuraGraphQLExecutorFactory.MWA_FRL_ANDROID_BUILD_CONFIG);
        return (cgm != null || (concurrentHashMap.isEmpty() && (cgm = concurrentHashMap.get(AuraGraphQLExecutorFactory.MWA_FRL_ANDROID_BUILD_CONFIG)) != null)) ? cgm : new C5178DbL(AuraGraphQLExecutorFactory.MWA_FRL_ANDROID_BUILD_CONFIG);
    }
}
