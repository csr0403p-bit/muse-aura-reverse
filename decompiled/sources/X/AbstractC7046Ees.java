package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Ees, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7046Ees implements InterfaceC7064EfB {
    public static final Set<String> mImageExtrasList = BV5.A0v(new String[]{"encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "smart_original_url", "smart_fetch_strategy", "image_color_space", "smart_variation", "smart_query", "smart_aiq", "last_scan_num"});
    public C2eL mCacheImageInfo;
    public final Map<String, Object> mExtras = BV4.A0u();

    @Override // X.InterfaceC7060Ef7
    public <T> T getExtra(String str) {
        return (T) getExtra(str, null);
    }

    @Override // X.InterfaceC7060Ef7
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    @Override // X.InterfaceC7064EfB
    public C2eL getImageInfo() {
        C2eL c2eL = this.mCacheImageInfo;
        if (c2eL != null) {
            return c2eL;
        }
        int width = getWidth();
        int height = getHeight();
        getSizeInBytes();
        EfL efL = new EfL(getQualityInfo(), this.mExtras, width, height);
        this.mCacheImageInfo = efL;
        return efL;
    }

    @Override // X.InterfaceC7064EfB
    public InterfaceC7034Eeg getQualityInfo() {
        return C7070EfR.A03;
    }

    @Override // X.InterfaceC7064EfB
    public boolean isStateful() {
        return false;
    }

    @Override // X.InterfaceC7060Ef7
    public <E> void putExtra(String str, E e) {
        if (mImageExtrasList.contains(str)) {
            this.mExtras.put(str, e);
        }
    }

    @Override // X.InterfaceC7060Ef7
    public void putExtras(Map<String, ? extends Object> map) {
        if (map != null) {
            for (String str : mImageExtrasList) {
                Object obj = map.get(str);
                if (obj != null) {
                    this.mExtras.put(str, obj);
                }
            }
        }
    }

    public <T> T getExtra(String str, T t) {
        T t2 = (T) this.mExtras.get(str);
        if (t2 == null) {
            return t;
        }
        return t2;
    }
}
