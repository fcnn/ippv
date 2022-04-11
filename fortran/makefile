all: ippv

ippv: core.o main.o
	gfortran -o $@ $^

%.o: %.f08
	gfortran --std=gnu -c $^
#	gfortran --std=f2018 -c $^

.PHONY: clean
clean:
	rm -f ippv *.o
