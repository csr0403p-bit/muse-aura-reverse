package androidx.media3.exoplayer.source;

import X.DQC;
import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final ImmutableList<DQC> sniffFailures;
    public final Uri uri;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Landroid/net/Uri;Ljava/util/List<+LX/DQC;>;)V */
    public UnrecognizedInputFormatException(Uri uri, String str, List list) {
        super(str, null, 1, false);
        this.uri = uri;
        this.sniffFailures = ImmutableList.copyOf((Collection) list);
    }
}
