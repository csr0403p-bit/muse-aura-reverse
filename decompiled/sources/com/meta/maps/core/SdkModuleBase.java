package com.meta.maps.core;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import X.FGI;
import android.util.Log;
import com.meta.maps.NativeBase;
import com.meta.maps.core.SdkModuleBase;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class SdkModuleBase {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "MapsSDK";
    public final Object _lock = C3cG.A0T();
    public LoadState _state = LoadState.UNLOADED;
    public final List<LoadedListener> _loadedListeners = C3cG.A0h();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LoadState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ LoadState[] $VALUES;
        public static final LoadState LOADED;
        public static final LoadState LOADING;
        public static final LoadState UNLOADED;

        static {
            LoadState loadState = new LoadState("UNLOADED", 0);
            UNLOADED = loadState;
            LoadState loadState2 = new LoadState("LOADING", 1);
            LOADING = loadState2;
            LoadState loadState3 = new LoadState("LOADED", 2);
            LOADED = loadState3;
            LoadState[] loadStateArr = {loadState, loadState2, loadState3};
            $VALUES = loadStateArr;
            $ENTRIES = C3cG.A0w(loadStateArr);
        }

        public static Ey9<LoadState> getEntries() {
            return $ENTRIES;
        }

        public static LoadState valueOf(String str) {
            return (LoadState) Enum.valueOf(LoadState.class, str);
        }

        public static LoadState[] values() {
            return (LoadState[]) $VALUES.clone();
        }

        public LoadState(String str, int i) {
        }
    }

    public final class LoadedListener {
        public final Function0<Unit> callback;

        public LoadedListener(Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 0);
            this.callback = function0;
        }

        public final void notifyLoaded(String str) {
            C7384Etj.A0Y(str, 0);
            try {
                this.callback.invoke();
            } catch (Throwable th) {
                Log.e("MapsSDK", FGI.A0U("loaded listener of ", str, " threw"), th);
            }
        }
    }

    public final AutoCloseable addOnLoadedListener$xplat_maps_sdk_packages_core_core_kotlin(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        final LoadedListener loadedListener = new LoadedListener(function0);
        synchronized (this._lock) {
            if (this._state == LoadState.LOADED) {
                loadedListener.notifyLoaded(getName());
                return new AutoCloseable() { // from class: com.meta.maps.core.SdkModuleBase$addOnLoadedListener$2
                    @Override // java.lang.AutoCloseable
                    public final void close() {
                    }
                };
            }
            this._loadedListeners.add(loadedListener);
            return new AutoCloseable() { // from class: com.meta.maps.core.SdkModuleBase$addOnLoadedListener$1$1
                @Override // java.lang.AutoCloseable
                public final void close() {
                    SdkModuleBase sdkModuleBase = this.this$0;
                    Object obj = sdkModuleBase._lock;
                    SdkModuleBase.LoadedListener loadedListener2 = loadedListener;
                    synchronized (obj) {
                        AbstractC0882AGj.A0v(sdkModuleBase._loadedListeners, new SdkModuleBase$addOnLoadedListener$1$1$1$1(loadedListener2));
                    }
                }
            };
        }
    }

    public abstract String getName();

    public abstract void internalLoad();

    public final boolean ensureLoaded() {
        synchronized (this._lock) {
            LoadState loadState = this._state;
            LoadState loadState2 = LoadState.UNLOADED;
            if (loadState != loadState2) {
                return false;
            }
            this._state = LoadState.LOADING;
            try {
                Log.i("MapsSDK", FGI.A0M("load ", getName()));
                internalLoad();
                NativeBase.initialize();
                this._state = LoadState.LOADED;
                List listA0X = AbstractC0878AGe.A0X(this._loadedListeners);
                this._loadedListeners.clear();
                Iterator it = listA0X.iterator();
                while (it.hasNext()) {
                    ((LoadedListener) it.next()).notifyLoaded(getName());
                }
                return true;
            } catch (Throwable th) {
                this._state = loadState2;
                throw th;
            }
        }
    }

    public final boolean isLoaded() {
        boolean zA1Z;
        synchronized (this._lock) {
            zA1Z = AnonymousClass002.A1Z(this._state, LoadState.LOADED);
        }
        return zA1Z;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
