/**
 *  Copyright (c) 2011 Terracotta, Inc.
 *  Copyright (c) 2011 Oracle and/or its affiliates.
 *
 *  All rights reserved. Use is subject to license terms.
 */

package javax.cache.interceptor;

import java.lang.annotation.Annotation;

/**
 * Generates a {@link CacheKey} based on a {@link CacheInvocationContext}. Implementations MUST be
 * thread-safe.
 *
 * @author Eric Dalquist
 * @since 1.0
 */
public interface CacheKeyGenerator {

    /**
     * Called for each intercepted method invocation. Generate a {@link CacheKey} from the {@link CacheInvocationContext} data.
     *
     * @param cacheKeyInvocationContext Information about the intercepted method invocation
     * @return A non-null cache key for the invocation.
     */
    CacheKey generateCacheKey(CacheKeyInvocationContext<Annotation> cacheKeyInvocationContext);
}
