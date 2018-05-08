package au.sj.owl.ribapp.root

import com.uber.rib.core.InteractorHelper
import com.uber.rib.core.RibTestBasePlaceholder
import org.junit.*
import org.mockito.*

class RootInteractorTest : RibTestBasePlaceholder() {

    @Mock internal lateinit var presenter: RootInteractor.RootPresenter
    @Mock internal lateinit var router: RootRouter

    private var interactor: RootInteractor? = null

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)

        interactor = TestRootInteractor.create(presenter)
    }

    /**
     * TODO: Delete this example and add real tests.
     */
    @Test
    fun anExampleTest_withSomeConditions_shouldPass() {
        // Use InteractorHelper to drive your interactor's lifecycle.
        InteractorHelper.attach<RootInteractor.RootPresenter, RootRouter>(interactor!!, presenter, router, null)
        InteractorHelper.detach(interactor!!)

        throw RuntimeException("Remove this test and add real tests.")
    }
}