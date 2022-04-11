module core

type node_t
  integer:: value
  type(node_t(10)), pointer :: children;
  !type(node_t(10)), allocatable :: children;
end type node_t
type(node_t) :: tree

contains 

function parse() result(res)
        res = 99999;
end

function add_cc(cc,iso) result(res)
        character(30) :: cc
        character(3)  :: iso
        write (*,*) "adding ",cc,": ",iso
        res = 10000;
end

end module
