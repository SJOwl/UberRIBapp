package au.sj.owl.ribapp.root

import com.uber.rib.core.RibTestBasePlaceholder
import com.uber.rib.core.RouterHelper
import org.junit.*
import org.mockito.*

class RootRouterTest : RibTestBasePlaceholder() {

    @Mock internal lateinit var component: RootBuilder.Component
    @Mock internal lateinit var interactor: RootInteractor
    @Mock internal lateinit var view: RootView

    private var router: RootRouter? = null

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)

        router = RootRouter(view, interactor, component)
    }

    /**
     * TODO: Delete this example and add real tests.
     */
    @Test
    fun anExampleTest_withSomeConditions_shouldPass() {
        // Use RouterHelper to drive your router's lifecycle.
        RouterHelper.attach(router!!)
        RouterHelper.detach(router!!)

        throw RuntimeException("Remove this test and add real tests.")
    }

}

